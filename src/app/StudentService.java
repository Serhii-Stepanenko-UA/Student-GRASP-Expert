package app;

// Клас, який містить метод, що використовує інформацію про студента
class StudentService {
    public void printStudentInfo(Student student) {
        System.out.println("Ім'я студента: " + student.getName());
        System.out.println("Вік студента: " + student.getAge());
    }
}
