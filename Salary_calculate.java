// Abstract class
abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Full-time employee class
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Part-time employee class
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class to test
public class EmployeeDemo {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Alice", 101, 5000.0);
        PartTimeEmployee pte = new PartTimeEmployee("Bob", 102, 20.0, 80);

        System.out.println("Full-Time Employee:");
        fte.displayInfo();
        System.out.println("Monthly Salary: $" + fte.calculateSalary());

        System.out.println("\nPart-Time Employee:");
        pte.displayInfo();
        System.out.println("Calculated Salary: $" + pte.calculateSalary());
    }
}
