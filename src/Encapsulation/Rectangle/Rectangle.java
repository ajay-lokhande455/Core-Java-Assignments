package Encapsulation.Rectangle;
//Write a Java program to create a class called Rectangle with private instance variables length and width.
// Provide public getter and setter methods to access and modify these variables.
public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
class TestRect{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10.24);
        rectangle.setWidth(14.44);

        System.out.println("Length of rectangle "+ rectangle.getLength());
        System.out.println("width of rectangle "+ rectangle.getWidth());
    }
}
