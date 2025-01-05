package userinput;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        /*If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
        write a program to calculate his total marks and percentage marks.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Robert three subjects marks : ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;
        float per = total / 3;
        System.out.println("total marks of Robert are obtained : "+total);
        System.out.println("percentage of robert are obtained : "+per);;
    }
}
