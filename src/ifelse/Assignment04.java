package ifelse;

import java.util.Scanner;

public class Assignment04 {
    public static void main(String[] args) {
        //A company decided to give bonus of 50% to employee if his/her year of service is more than 5 years.
        //Ask user for their salary and year of service and print the net bonus amount.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary : ");
        double salary = sc.nextDouble();

        System.out.println("Enter your year of service : ");
        int year = sc.nextInt();

        if (year > 5){
            double bonus = 0.50 * salary;
            salary += bonus;
            System.out.println("After give bonus his/her year of service is more than 5 years is  :" +salary );
        }
        else {
            System.out.println("Salary is : "+ salary);
        }

    }
}
