package userinput;

import java.util.Scanner;

public class Assignment05 {
    public static void main(String[] args) {
        //Take side of a square from user and print area and perimeter of it.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sides of square: ");
        int side = sc.nextInt();

        int area = side * side;
        System.out.println("area of rectangle : "+area);

        int perimeter = 4 * side;
        System.out.println("Perimeter of square : "+perimeter);

    }
}
