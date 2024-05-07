package org.example.testCollection.task1.taski;

import java.util.ArrayList;
import java.util.List;

public class Course {
    public static void main(String[] args) {

    }

    private String courseName;
    private List<Student> students;

    // Конструктор
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Геттер и сеттер для названия курса
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Метод для добавления студента на курс
    public void addStudent(Student student) {
        students.add(student);
    }

    // Метод для удаления студента с курса
    public void removeStudent(Student student) {
        students.remove(student);
    }

    // Геттер для списка студентов
    public List<Student> getStudents() {
        return students;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", students=" + students +
                '}';
    }

    // Метод для вычисления среднего возраста студентов на курсе
    public double averageAgeOfStudents() {
        if (students.isEmpty()) {
            return 0; // Возвращаем 0 если список студентов пуст
        }

        int totalAge = 0;
        for (Student student : students) {
            totalAge += student.getAge();
        }

        return (double) totalAge / students.size();
    }
}
