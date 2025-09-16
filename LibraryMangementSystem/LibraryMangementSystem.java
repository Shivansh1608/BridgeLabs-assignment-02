import java.util.*;

class Book {
    private int bookId;
    private String title;
    private String author;
    private int availableCopies;

    public Book(int bookId, String title, String author, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void borrowCopy() {
        if (availableCopies > 0) {
            availableCopies--;
        } else {
            System.out.println("No copies available for " + title);
        }
    }

    public void returnCopy() {
        availableCopies++;
    }
}

abstract class Member {
    private int memberId;
    private String name;
    private String membershipType;
    protected int borrowedBooks = 0;

    public Member(int memberId, String name, String membershipType) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
    }

    public String getName() {
        return name;
    }

    public abstract void borrowBook(Book book);

    public void returnBook(Book book) {
        book.returnCopy();
        borrowedBooks--;
        System.out.println(name + " returned: " + book.getTitle()); 
    }
}

class StudentMember extends Member {
    private static final int BORROW_LIMIT = 3;

    public StudentMember(int memberId, String name) {
        super(memberId, name, "Student");
    }

    @Override
    public void borrowBook(Book book) {
        if (borrowedBooks < BORROW_LIMIT && book.getAvailableCopies() > 0) {
            book.borrowCopy();
            borrowedBooks++;
            System.out.println(getName() + " (Student) borrowed: " + book.getTitle()); 
        } else {
            System.out.println("Cannot borrow. Limit reached or no copies available."); 
        }
    }
}

class FacultyMember extends Member {
    private static final int BORROW_LIMIT = 5;

    public FacultyMember(int memberId, String name) {
        super(memberId, name, "Faculty");
    }

    @Override
    public void borrowBook(Book book) {
        if (borrowedBooks < BORROW_LIMIT && book.getAvailableCopies() > 0) {
            book.borrowCopy();
            borrowedBooks++;
            System.out.println(getName() + " (Faculty) borrowed: " + book.getTitle()); 
        } else {
            System.out.println("Cannot borrow. Limit reached or no copies available."); 
        }
    }
}

class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void showBooks() {
        System.out.println("\nAvailable Books:"); 
        for (Book b : books) {
            System.out.println(b.getTitle() + " | Copies: " + b.getAvailableCopies()); 
        }
    }

    public void showMembers() {
        System.out.println("\nMembers:"); 
        for (Member m : members) {
            System.out.println(m.getName()); 
        }
    }
}

public class LibraryMangementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book(101, "Java Programming", "James Gosling", 2);
        Book b2 = new Book(102, "Data Structures", "Robert Lafore", 1);
        library.addBook(b1);
        library.addBook(b2);

        Member s1 = new StudentMember(1, "Alice");
        Member f1 = new FacultyMember(2, "Dr. Bob");
        library.addMember(s1);
        library.addMember(f1);

        library.showBooks();

        s1.borrowBook(b1); 
        f1.borrowBook(b1);
        f1.borrowBook(b2);
        s1.borrowBook(b2); 

        f1.returnBook(b1); 
        s1.borrowBook(b2); 

        library.showBooks(); 
    }
}
