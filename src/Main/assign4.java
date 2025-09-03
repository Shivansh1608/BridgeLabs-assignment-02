package Main;

class Student {
    String name;
    int marks;

  
    Student(String n, int m) {
        name = n;
        marks = m;
    }

    
    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        
        Student s1 = new Student("ramu", 85);
        Student s2 = new Student("shyam", 92);

        
        s1.display();
        s2.display();
    }
}

