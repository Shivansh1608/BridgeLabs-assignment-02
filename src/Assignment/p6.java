package Assignment;

class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 75) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class p6 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice Johnson", 101, 92);
        Student s2 = new Student("Raj Kumar", 102, 68);
        Student s3 = new Student("Meena Sharma", 103, 47);

        System.out.println("=== Student 1 ===");
        s1.displayDetails();

        System.out.println("\n=== Student 2 ===");
        s2.displayDetails();

        System.out.println("\n=== Student 3 ===");
        s3.displayDetails();
    }
}
