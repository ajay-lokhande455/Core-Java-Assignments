package methods;

import java.util.Scanner;

//Write a program to print the circumference and area
// of a circle of radius entered by user by defining your own method.
public class Assignment06 {

    public static double areaOfCircleOfRadius(double number){
        return 2 * Math.PI * number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        double radius = sc.nextDouble();
        System.out.println("Radius of circle is : "+ radius);
        System.out.println("circumference and area of circle of radius: "+ areaOfCircleOfRadius(radius));
    }
}
