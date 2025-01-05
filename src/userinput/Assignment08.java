package userinput;

import java.util.Scanner;

public class Assignment08 {
    public static void main(String[] args) {
        //Take 3 inputs from user and check :
        //all are equal
        //any of two are equal
        //( use && ||)
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        if(num1 == num2 && num2 == num3){
            System.out.println("all are equal");
        } else if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("any of two are equal");
        }
        else {
            System.out.println("non of the number equal");
        }
    }
}
