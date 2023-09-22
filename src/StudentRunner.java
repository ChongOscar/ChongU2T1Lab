public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("joe", 16, 0.5);
        Student student2 = new Student("bob", 15, 4.0);
        student1.introduce();
        student1.grades();
        student2.introduce();
        student2.grades();
    }
}
