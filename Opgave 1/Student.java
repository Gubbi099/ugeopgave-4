import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private int ID;

    private static ArrayList<Student> students = new ArrayList<>();

    private static int countID = 0;



    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = countID;

        countID++;
        students.add(this);
    }

    public void printInfo() {
        System.out.println("Student name: " + this.name + " Student age: " + this.age + " Student ID: " + this.ID);
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }
}
