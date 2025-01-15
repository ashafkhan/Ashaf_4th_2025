// Write a Java program to create an Employee class where an Overloaded constructor initializes employee details.The default constructor should Initialize name as "Unknown" and salary as 0 and the second constructor initializes the name and sets a default salary.  Create a method DisplayEmployeeDetails() to display employee information.

public class Experiment03 {
    public static void main(String args[]){
        Employee emp1 = new Employee();
        System.out.println("Details of Employee 1:");
        emp1.displayEmployeeDetails();

        System.out.println();

        Employee emp2 = new Employee("Alice");
        System.out.println("Details of Employee 2:");
        emp2.displayEmployeeDetails();
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee() {
        this.name = "Unknown";
        this.salary = 0.0;
    }

    public Employee(String name) {
        this.name = name;
        this.salary = 30000.0;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
    }
}
