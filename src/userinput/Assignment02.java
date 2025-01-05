package userinput;

import java.util.Scanner;

public class Assignment02 {
    public static void main(String[] args) {

    //1. Take two integer inputs from user.
    //2. First calculate the sum of two then product of two.
    //3. Finally, print the sum and product of both obtained results.
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter two Number : ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    int sum = num1 + num2;
    int product = num1 * num2;

        System.out.println("SUM = "+ sum +" PRODUCT = "+ product);
}

}

