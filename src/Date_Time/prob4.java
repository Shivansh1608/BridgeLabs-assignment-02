package Date_Time;

import java.time.LocalDate;
import java.util.Scanner;

public class prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the first date (yyyy-mm-dd): ");
        String input1 = sc.nextLine();
        LocalDate date1 = LocalDate.parse(input1);

   
        System.out.print("Enter the second date (yyyy-mm-dd): ");
        String input2 = sc.nextLine();
        LocalDate date2 = LocalDate.parse(input2);


        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is the same as " + date2);
        }

        sc.close();
    }
}
