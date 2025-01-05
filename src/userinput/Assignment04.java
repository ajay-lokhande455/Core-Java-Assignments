package userinput;

import java.util.Scanner;

public class Assignment04 {
    public static void main(String[] args) {
        //Take name, roll number and field of interest from user and print in the format below
        //Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String str1 = sc.next();

        System.out.println("Enter roll number: ");
        int roll_number = sc.nextInt();

        System.out.println("Enter field of interest: ");
        double interest = sc.nextDouble();

        System.out.println("my is Name: "+str1);
        System.out.println("my roll number: "+roll_number);
        System.out.println("my field of interest are: "+interest);
    }
}
