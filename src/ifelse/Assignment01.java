package ifelse;

import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {
        //Take values of length and breadth of a rectangle from user and check if it is square or not.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth of rectangle : ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        if(length == breadth){
            System.out.println("it is square ");
        }
        else {
            System.out.println("it not square");
        }
    }
}
