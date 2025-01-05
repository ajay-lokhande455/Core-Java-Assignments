package ifelse;

import java.util.Scanner;

public class Assignment03 {
    public static void main(String[] args) {
        //1. A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
        //2. Ask user for quantity
        //3. Suppose, one unit will cost 100.
        //4. Judge and print total cost for user.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter quantity is you want to purchased: ");
        int quantity = sc.nextInt();

        int costPerUnit = 100;
        int totalCost = quantity * costPerUnit;

        if(totalCost >= 1000)
        {
            double discount = 0.10 * totalCost;
            totalCost -= discount;
            System.out.println("Total cost after applying 10 % discount is : "+totalCost);
        }
        else {
            System.out.println("Total cost : "+totalCost);
        }
    }
}
