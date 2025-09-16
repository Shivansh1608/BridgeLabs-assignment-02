package ATM;

import java.util.*;

abstract class ATM {
    private String location;
    private String machineId;

    public ATM(String location, String machineId) {
        this.location = location;
        this.machineId = machineId;
    }

    public String location() { return location; }
    public String machineId() { return machineId; }

    public abstract void withdraw(Account account, double amount);
    public abstract void deposit(Account account, double amount);
}

class Account {
    private int accountNumber;
    private String holderName;
    protected double balance;
    private List<Transaction> transactions;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public int accountNumber() { return accountNumber; }
    public String holderName() { return holderName; }
    public double balance() { return balance; }
    public List<Transaction> getTransactions() { return transactions; }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }
}

class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public boolean canWithdraw(double amount) {
        return (balance - amount) >= MIN_BALANCE;
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public boolean canWithdraw(double amount) {
        return balance >= amount;
    }
}

class Transaction {
    private String transactionId;
    private Date date;
    private double amount;
    private String type;

    public Transaction(double amount, String type) {
        this.transactionId = UUID.randomUUID().toString();
        this.date = new Date();
        this.amount = amount;
        this.type = type;
    }

    public String transactionId() { return transactionId; }
    public Date date() { return date; }
    public double amount(){ return amount; }
    public String type() { return type; }
}

interface TransactionLogger {
    void log(Transaction transaction);
}

class ConsoleTransactionLogger implements TransactionLogger {
    public void log(Transaction transaction) {
        System.out.println("Transaction: " + transaction.transactionId() +
                " | " + transaction.type() +
                " | Amount: " + transaction.amount() +
                " | Date: " + transaction.date());
    }
}

class BankATM extends ATM {
    private TransactionLogger logger;

    public BankATM(String location, String machineId, TransactionLogger logger) {
        super(location, machineId);
        this.logger = logger;
    }

    public void withdraw(Account account, double amount) {
        boolean allowed = true;
        if (account instanceof SavingsAccount) {
            allowed = ((SavingsAccount) account).canWithdraw(amount);
        } else if (account instanceof CurrentAccount) {
            allowed = ((CurrentAccount) account).canWithdraw(amount);
        }
        if (allowed) {
            account.balance -= amount;
            Transaction t = new Transaction(amount, "Withdraw");
            account.addTransaction(t);
            logger.log(t);
        } else {
            System.out.println("Withdrawal denied: Insufficient balance.");
        }
    }

    public void deposit(Account account, double amount) {
        account.balance += amount;
        Transaction t = new Transaction(amount, "Deposit");
        account.addTransaction(t);
        logger.log(t);
    }
}

public class ATMmanagementsystem {
    public static void main(String[] args) {
        TransactionLogger logger = new ConsoleTransactionLogger();
        BankATM atm = new BankATM("Delhi", "ATM123", logger);

        SavingsAccount sa = new SavingsAccount(101, "Alice", 1000);
        CurrentAccount ca = new CurrentAccount(102, "Bob", 2000);

        atm.withdraw(sa, 400);
        atm.deposit(sa, 200);
        atm.withdraw(ca, 1500);

        System.out.println("Final Balance of " + sa.holderName() + ": " + sa.balance());
        System.out.println("Final Balance of " + ca.holderName() + ": " + ca.balance());

        System.out.println("\nAlice's Transactions:");
        for (Transaction t : sa.getTransactions()) {
            System.out.println(t.type() + " - " + t.amount() + " on " + t.date());
        }
    }
}
