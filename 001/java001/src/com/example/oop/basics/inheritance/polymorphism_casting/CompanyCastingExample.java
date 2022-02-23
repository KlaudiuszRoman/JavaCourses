package com.example.oop.basics.inheritance.polymorphism_casting;

class Employee {
    private String name;
    private String jobTitle;
    private int salary;
    // constructors:
    public Employee() {
        name = "unknown";
        jobTitle = "unknown";
        salary = 4000;
    }

    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    // functions:
    public void doWork() {
        System.out.println(" Doing work!");
    }

    public void printInfo() {
        System.out.println("Employee: " + name);
    }
    // getters && setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

class Manager extends Employee {
    private String departmentName;
    // constructors:
    public Manager() {
        this.departmentName = "unknown";
    }

    public Manager(String name, String jobTitle, int salary, String departmentName) {
        super(name, jobTitle, salary);
        this.departmentName = departmentName;
    }
    // functions:
    public void hireEmployee() {
        System.out.println("Employee hired!");
    }

    public void giveRise(Employee employee) {
        System.out.println("Employee got rise!");
    }

    public void printInfo() {
        System.out.println("Manager: " + getName());
    }
    // getters && setters
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}

class Ceo extends Manager {
    private int sharesNumber;

    public Ceo() {
        this.sharesNumber = 100;
    }

    public Ceo(String name, String jobTitle, int salary, String departmentName, int sharesNumber) {
        super(name, jobTitle, salary, departmentName);
        this.sharesNumber = sharesNumber;
    }

    public void signContract() {
        System.out.println("Contract signed!");
    }

    public void printInfo() {
        System.out.println("Ceo: " + getName());
    }

    public int getSharesNumber() {
        return sharesNumber;
    }

    public void setSharesNumber(int sharesNumber) {
        this.sharesNumber = sharesNumber;
    }

}

public class CompanyCastingExample {
    public static void main(String[] args) {
        Employee employee = new Employee("Adam", "Programmer", 10000);
        Manager manager = new Manager("Kasia", "Team Leader",
                10000, "R&D");
        Employee employeeCeo = new Ceo("Rafał", "Prezes", 20000,
                "Board", 100);

        if(employeeCeo instanceof Ceo) {
            Ceo ceo = (Ceo) employeeCeo;
            ceo.signContract();
        }
    }
}
