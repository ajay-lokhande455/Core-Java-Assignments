package userinput;

import java.util.Scanner;

public class Assignment03 {
    public static void main(String[] args) {
        //Ask user to give two double input for length and breadth of rectangle
        // and print area type casted to int.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth of rectangle");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        double total = length * breadth;
        int area = (int)total;
        System.out.println("Area of rectangle "+ area);

    }
}
