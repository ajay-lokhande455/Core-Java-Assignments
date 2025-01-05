package classs;

public class Triangle {
    //Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
    // creating a class named 'Triangle' without any parameter in its constructor.
    double side1;
    double side2;
    double side3;

    public Triangle() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        double semiPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }

    // Method to print the area and perimeter of the triangle
    public void printDetails() {
        System.out.printf("Perimeter: %.2f\n", calculatePerimeter());
        System.out.printf("Area: %.2f\n", calculateArea());
    }

    public static void main(String[] args) {
        // Create an instance of the Triangle class
        Triangle triangle = new Triangle();

        // Print the area and perimeter of the triangle
        triangle.printDetails();

    }
}