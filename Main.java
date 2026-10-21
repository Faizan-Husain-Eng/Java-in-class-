class Student {
    int rollNo;
    String name;

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();  // object creation

        s1.rollNo = 101;
        s1.name = "Faizan";

        s1.display();  // method call
    }
}