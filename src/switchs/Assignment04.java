package switchs;

import java.util.Scanner;
//Take two numbers from user and an operator (+, -, *, /) and then calculate the value. (Use switch statement)
public class Assignment04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter operator you want to calculate: ");
        char operator = sc. next().charAt(0);

        switch (operator){
            case ('+') -> System.out.println("addition: "+(a+b));
            case ('-') -> System.out.println("substraction : "+(a-b));
            case ('*') -> System.out.println("multiplication: "+(a*b));
            case ('/') -> System.out.println("division: "+(a/b));
            default -> System.out.println("invalid..");
        }
    }
}
