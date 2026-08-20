class Student {
    protected int id;
    protected String name;
    protected String dept;

    public Student(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public void displayStudent() {
        System.out.println("ID: " + id + " | Name: " + name + " | Dept: " + dept);
    }
}

class UndergraduateStudent extends Student {
    private int semester;
    private double cgpa;

    public UndergraduateStudent(int id, String name, String dept, int semester, double cgpa) {
        super(id, name, dept);
        this.semester = semester;
        this.cgpa = cgpa;
    }

    public void displayUG() {
        displayStudent();
        System.out.println("Semester: " + semester + " | CGPA: " + cgpa);
    }
}

class PostgraduateStudent extends Student {
    private String specialization;
    private String researchTopic;

    public PostgraduateStudent(int id, String name, String dept, String spec, String topic) {
        super(id, name, dept);
        this.specialization = spec;
        this.researchTopic = topic;
    }

    public void displayPG() {
        displayStudent();
        System.out.println("Specialization: " + specialization + " | Topic: " + researchTopic);
    }
}

public class Practicum2 {
    public static void main(String[] args) {
        UndergraduateStudent ug = new UndergraduateStudent(101, "Ravi", "CSE", 5, 8.75);
        PostgraduateStudent pg = new PostgraduateStudent(201, "Anita", "ECE", "AI", "Vision");

        ug.displayUG();
        System.out.println();
        pg.displayPG();
    }
}