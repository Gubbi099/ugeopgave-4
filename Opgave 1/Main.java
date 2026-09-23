public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Jeff", 18);
        Student student2 = new Student("Preben", 18);
        Student student3 = new Student("John", 20);

        for (Student student : Student.getStudents()) {
            student.printInfo();
        }
    }

}
