package NestedClass;
//Write a Java program to create an outer class called Computer with an inner class Processor. The Processor
// class should have a method "displayDetails()" that prints the details of the processor (e.g., brand and speed).
// Create an instance of Processor from the Computer class and call the "displayDetails()" method.
public class Computer {
    class Processor {
        private String brand;
        private double speed;

        public Processor(String brand, double speed) {
            this.brand = brand;
            this.speed = speed;
        }

        public void displayDetail() {
            System.out.println("Processor brand is: " + brand);
            System.out.println("Processor speed is: " + speed);
        }
    }

public static void main(String[] args) {
            Computer computer = new Computer();
            Computer.Processor processor= computer.new Processor("Intel",3.5);
            processor.displayDetail();
    }
}
