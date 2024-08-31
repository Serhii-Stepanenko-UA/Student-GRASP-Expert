package app;

// Клас, що містить інформацію про студента
class Student {
    private String name;
    private int age;

    // Конструктор та методи доступу до полів класу

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}