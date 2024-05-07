package org.example.testCollection.task1.taski;
import java.util.ArrayList;
import java.util.List;
public class Student {
    public static void main(String[] args) {

    }

    private String firstName;
    private String lastName;
    private int age;

    private List<Course> courses;

    // Конструктор
    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        setAge(age);
        this.courses = new ArrayList<>();
    }

    // Геттеры и сеттеры для имени
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Геттеры и сеттеры для фамилии
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Геттеры и сеттеры для возраста
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Геттеры и сеттеры для списка курсов
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    // Метод для добавления курса студенту
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Метод для удаления курса у студента
    public void removeCourse(Course course) {
        courses.remove(course);
    }


    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    // Переопределение метода equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;

        if (age != student.age) return false;
        if (!firstName.equals(student.firstName)) return false;
        return lastName.equals(student.lastName);
    }

    // Переопределение метода hashCode()
    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + age;
        return result;


    }

    // Метод для получения списка студентов на курсе
    public List<Student> getStudentsOnCourse(Course course) {
        List<Student> studentsOnCourse = new ArrayList<>();
        for (Student student : course.getStudents()) {
            if (student.getCourses().contains(course)) {
                studentsOnCourse.add(student);
            }
        }
        return studentsOnCourse;
    }
}


