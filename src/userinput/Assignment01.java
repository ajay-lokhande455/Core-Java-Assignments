package userinput;

import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {
        //Write a program to take two integer inputs from user and print sum and product of them.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;

        System.out.println("SUM = "+ sum +" PRODUCT = "+ product);
    }
}
