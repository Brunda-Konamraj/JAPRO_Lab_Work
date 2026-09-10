import college.Student;
 
public class PackageDemo {
 
    public static void main(String[] args) {
 
        Student s1 = new Student(101, "Ravi");
        Student s2 = new Student(102, "Meera");
 
        s1.display();
 
        System.out.println();
 
        s2.display();
    }
}
