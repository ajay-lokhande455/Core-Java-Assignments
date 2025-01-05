package AbstractKeyword;
//Write a Java program to create an abstract class Shape with abstract methods calculateArea() and
// calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the
// respective methods to calculate the area and perimeter of each shape.
public abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    double PI = Math.PI;
    @Override
    double calculateArea() {
        return PI * radius * radius;
        }

    @Override
    double calculatePerimeter() {
        return 2 * PI * radius ;
    }
}
class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s * side1) * s * (s * side2) * s * (s * side3));
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3 ;
    }
}
class TestShape{
    public static void main(String[] args) {
        Shape shape = new Circle(23);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());

        Shape shape1 = new Triangle(12,14,12);
        System.out.println(shape1.calculateArea());
        System.out.println(shape1.calculatePerimeter());
    }
}
