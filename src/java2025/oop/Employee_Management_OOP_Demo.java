package java2025.oop;

abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getRole();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " (" + age + ") - " + getRole();
    }
}

class Developer extends Person {
    private String language;

    public Developer(String name, int age, String language) {
        super(name, age);
        this.language = language;
    }

    @Override
    public String getRole() {
        return "Developer (" + language + ")";
    }
}

class Manager extends Person {
    private int teamSize;

    public Manager(String name, int age, int teamSize) {
        super(name, age);
        this.teamSize = teamSize;
    }

    @Override
    public String getRole() {
        return "Manager (Team size: " + teamSize + ")";
    }
}

class Company {
    private static int employeeCount = 0;

    public static void hire(Person p) {
        employeeCount++;
        System.out.println("Hired: " + p);
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }
}

public class Employee_Management_OOP_Demo {
    public static void main(String[] args) {
        Person dev = new Developer("Eldar", 23, "Java");
        Person manager = new Manager("Malik", 30, 5);

        Company.hire(dev);
        Company.hire(manager);

        System.out.println("Total employees: " + Company.getEmployeeCount());
    }
}