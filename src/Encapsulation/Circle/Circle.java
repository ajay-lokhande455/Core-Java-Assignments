package Encapsulation.Circle;
//Write a Java program to create a class called Circle with a private instance variable radius.
// Provide public getter and setter methods to access and modify the radius variable.
// However, provide two methods called calculateArea() and calculatePerimeter()
// that return the calculated area and perimeter based on the current radius value.
public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    double PI = Math.PI;
    public double calculateArea(double radius){
        this.radius = radius;
        return PI * radius * radius;
    }
    public double calculatePerimeter(double radius){
        return 2 * PI * radius;
    }
}
class TextCircle{
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(12.45);

        System.out.println("Radius of circle : "+circle.getRadius());

        System.out.println("Area of circle is : "+circle.calculateArea(circle.getRadius()));
        System.out.println("Perimeter of circle is : "+circle.calculatePerimeter(circle.getRadius()));
    }
}
