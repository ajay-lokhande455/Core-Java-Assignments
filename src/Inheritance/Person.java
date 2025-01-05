package Inheritance;
//Create a class “Person” with fields “name” and “age” and a method “display()” that prints the name and age of the person.
//Create a subclass “Employee” that extends “Person” and adds a field “salary” and a method “display()”
//  that prints the name, age, and salary of the employee.
//Create an object of the “Person” class and call the “display()” method.
//Create an object of the `Employee` class and call the “display()” method.
public class Person {
    int age;
    String  name;
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void display(){
        System.out.println("Name of the person: "+name);
        System.out.println("age of the person: "+age);
    }
}
class EmployeeP extends Person{
    private double salary;
    public EmployeeP(int age, String name, double salary){
        super(age,name);
        this.salary = salary;
    }
    public void display(){
        System.out.println("Name of the Employee: "+name);
        System.out.println("age of the Employee: "+age);
        System.out.println("Salary of Employee : "+salary);
    }
}
class TestPerson{
    public static void main(String[] args) {
        Person person = new Person(21,"Ajay");
        person.display();
        EmployeeP employee = new EmployeeP(22,"Ajay",35000.00);
        employee.display();
    }
}

