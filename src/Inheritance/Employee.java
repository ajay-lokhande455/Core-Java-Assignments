package Inheritance;
//Write a Java program that creates a class hierarchy for employees of a company. The base class should be
// Employee, with subclasses Manager, Developer, and  Programmer. Each subclass should have properties such as name,
// address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and
// managing projects

public class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.10; // 10% bonus
    }

    // Method to generate performance report
    public String generatePerformanceReport() {
        return "Performance report for " + name + " (" + jobTitle + ")";
    }

    public String getName(){
        return name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: $" + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}
class Manager extends Employee{

    private int numberOfProjects;

    public Manager(String name, String address, double salary, String jobTitle, int numberOfProject) {
        super(name, address, salary, jobTitle);
        this.numberOfProjects = numberOfProject;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }

    public void manageProject() {
        System.out.println(name + " is managing " + numberOfProjects + " projects.");
    }

    // Override generatePerformanceReport method
    @Override
    public String generatePerformanceReport() {
        return super.generatePerformanceReport() + "\nManaged Projects: " + numberOfProjects;
    }
}

// Subclass: Developer
class Developer extends Employee {
    private String[] programmingLanguages;

    // Constructor
    public Developer(String name, String address, double salary, String jobTitle, String[] programmingLanguages) {
        super(name, address, salary, jobTitle);
        this.programmingLanguages = programmingLanguages;
    }

    // Override calculateBonus method
    @Override
    public double calculateBonus() {
        return salary * 0.15; // 15% bonus for developers
    }

    // Method to display programming languages
    public void displayProgrammingLanguages() {
        System.out.println(name + " knows the following programming languages:");
        for (String language : programmingLanguages) {
            System.out.println(language);
        }
    }

    // Override generatePerformanceReport method
    @Override
    public String generatePerformanceReport() {
        return super.generatePerformanceReport() + "\nProgramming Languages: " + String.join(", ", programmingLanguages);
    }
}

// Subclass: Programmer
class Programmer extends Employee {
    private int linesOfCodeWritten;

    // Constructor
    public Programmer(String name, String address, double salary, String jobTitle, int linesOfCodeWritten) {
        super(name, address, salary, jobTitle);
        this.linesOfCodeWritten = linesOfCodeWritten;
    }

    // Override calculateBonus method
    @Override
    public double calculateBonus() {
        return salary * 0.12; // 12% bonus for programmers
    }

    // Method to display lines of code written
    public void displayLinesOfCodeWritten() {
        System.out.println(name + " has written " + linesOfCodeWritten + " lines of code.");
    }

    // Override generatePerformanceReport method
    @Override
    public String generatePerformanceReport() {
        return super.generatePerformanceReport() + "\nLines of Code Written: " + linesOfCodeWritten;
    }
}

// Main class to test the hierarchy
 class Emoloyee {
    public static void main(String[] args) {
        // Create instances of each class
        Manager manager = new Manager("Alice", "123 Main St", 95000, "Manager", 5);
        Developer developer = new Developer("Bob", "456 Oak St", 85000, "Developer", new String[]{"Java", "Python", "C++"});
        Programmer programmer = new Programmer("Charlie", "789 Pine St", 70000, "Programmer", 50000);

        // Display info and perform actions
        System.out.println("Manager Info:");
        manager.displayInfo();
        manager.manageProject();
        System.out.println("Bonus: $" + manager.calculateBonus());
        System.out.println(manager.generatePerformanceReport());

        System.out.println("\nDeveloper Info:");
        developer.displayInfo();
        developer.displayProgrammingLanguages();
        System.out.println("Bonus: $" + developer.calculateBonus());
        System.out.println(developer.generatePerformanceReport());

        System.out.println("\nProgrammer Info:");
        programmer.displayInfo();
        programmer.displayLinesOfCodeWritten();
        System.out.println("Bonus: $" + programmer.calculateBonus());
        System.out.println(programmer.generatePerformanceReport());
    }

}
