package Lesson5;

public class Employee {
    // Поля класса | объекты
    private String fullName; // Ф.И.О.
    private String position; // Должность
    private String email; // емаил
    private String phone; // Телефон
    private int salary; // Зарплата
    private int age; // Возраст

    // Конструктор
    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
}
