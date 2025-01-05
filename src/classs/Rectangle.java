package classs;

import java.util.Scanner;

public class Rectangle {

        //1. Write a program in java to print the area of a rectangle by creating a class named 'Rectangle'
        // having two methods.
        //    1. First method named as 'setDimension' takes length and breadth of rectangle as parameters
        //    and the second method named as '**getArea**' returns the area of the rectangle.
        //    2. Length and breadth of rectangle are entered through keyboard.

        double length;
        double breadth;
        public void setDimension(double length, double breadth){
            this.length = length;
            this.breadth = breadth;

        }
        public double getArea(){
            return  length * breadth;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        Rectangle rect = new Rectangle();

        rect.setDimension(length,breadth);
        System.out.println("Area of rectangle : "+rect.getArea());
    }

}

