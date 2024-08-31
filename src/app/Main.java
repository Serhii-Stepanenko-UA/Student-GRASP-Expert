package app;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкту класу Student з інформацією про студента
        Student student = new Student("Іван", 20);

        // Створення об'єкту класу StudentService
        StudentService studentService = new StudentService();

        // Виклик методу для друку інформації про студента
        studentService.printStudentInfo(student);
    }
}
