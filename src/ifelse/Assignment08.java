package ifelse;

import java.util.Scanner;

public class Assignment08 {
    public static void main(String[] args) {
        /*A student will not be allowed to sit in exam if his/her attendance is less than 75%.
        Take following input from user
        Number of classes held
        Number of classes attended.
        And print
        percentage of class attended
        Is student is allowed to sit in exam or not.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your classes held: ");
        int ClassHeld = sc.nextInt();

        System.out.println("Enter Number of attended: ");
        int attendance = sc.nextInt();

        float per = (float)attendance / ClassHeld * 100;
        System.out.println("Your percentage of class attended :"+per);
        if (per>75){
            System.out.println("You are able to sit in exam..");
        }
        else {
            System.out.println("You are not able to sit in exam...");
        }

    }
}
