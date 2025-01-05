package switchs;

import java.util.Scanner;

public class Assignment02 {
    //Take a number from user and print whether it is positive or negative. (Use switch statement)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any no : ");
        int no = sc.nextInt();

        int sign = (no >= 0)? 1: -1;

        switch (sign){
            case 1:
                System.out.println("The number is positive..");
                break;
            case -1:
                System.out.println("The number is negative..");
                break;
            default:
                System.out.println("number is zero..");
        }
        }
    }


