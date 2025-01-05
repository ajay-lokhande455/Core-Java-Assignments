package ifelse;

import java.util.Scanner;

public class Assignment02 {
    public static void main(String[] args) {
        //Take two int values from user and print greatest among them.
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter two values");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.println("greater is :"+a);
        }
        else {
            System.out.println("greater is; "+b);
        }
    }
}
