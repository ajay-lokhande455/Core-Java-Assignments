package interfaces;
//Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle,
// Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three
// classes.
public interface Shape {
    double getArea();
}
class Rectangle implements Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
class Triangle implements Shape{
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return 0.5 * (base * height);
    }
}
class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(3,6);
        System.out.println("Area of rectangle: "+shape1.getArea());

        Shape shape2 = new Triangle(23,45);
        System.out.println("Area of Triangle: "+shape2.getArea());

        Shape shape3 = new Circle(32);
        System.out.println("area of circle : "+shape3.getArea());
    }
}


