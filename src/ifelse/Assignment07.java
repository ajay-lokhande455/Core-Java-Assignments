package ifelse;

import java.util.Scanner;

public class Assignment07 {
    public static void main(String[] args) {
        //Write a program to print absolute value of a number entered by user. E.g.-

        //INPUT: 1 OUTPUT: -1

        //INPUT: -1 OUTPUT: 1

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter any value: ");
        double value = sc.nextDouble();

        double absoluteValue;
        if (value>0){
            absoluteValue = -value;
        }
        else {
            absoluteValue = value;
        }
        System.out.println("The absolute value of "+value+" is "+absoluteValue);
    }
}
