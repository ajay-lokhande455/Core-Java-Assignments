package classAndObject;
//Write a Java program to create a class called "Rectangle" with width and height attributes.
// Calculate the area and perimeter of the rectangle.
public class Rectangle {
    public double width ;
    public double height ;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double areaOfRectangle(){
        return width * height;
    }
    public double PerimeterOfRectangle(){
        return 2 * (width * height);
    }
}
class TestRectangle{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12,13);
        System.out.println("Area of Rectangle: "+rectangle.areaOfRectangle());
        System.out.println("Perimeter of Rectangle : "+rectangle.PerimeterOfRectangle());
    }

}
