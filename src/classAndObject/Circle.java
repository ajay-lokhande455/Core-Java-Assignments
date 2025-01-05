package classAndObject;
//Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify
// this attribute. Calculate the area and circumference of the circle.
public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
}
class TestCircle{
    public static void main(String[] args) {
        Circle circle = new Circle(12);

        System.out.println("\ncircle before radius : "+circle.getRadius());
        System.out.println("area of circle : "+ circle.getArea());
        System.out.println("Circumference of circle :"+ circle.getCircumference());

        circle.setRadius(7);
        System.out.println("\ncircle after radius updated: "+circle.getRadius());
        System.out.println("area of circle : "+ circle.getArea());
        System.out.println("Circumference of circle :"+ circle.getCircumference());

    }
}
