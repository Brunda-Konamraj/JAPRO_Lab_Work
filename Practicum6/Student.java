package college;
 
public class Student {
 
    private int rollNumber;
    private String name;
 
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }
 
    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + name);
    }
}
