package Practice;

import java.util.Scanner;

//Write a Java program for generating the nth Fibonacci Number using loop and O(1) space.
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no : ");
        int no = scanner.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i <= no ; i++) {
            System.out.println(a+" ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
