package Operators;

public class Assignment03 {
    //- Write a program to add 8 to the number 2345 and then divide it by 3.
    //- Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5.
    //- Display the final result.
    public static void main(String[] args) {

        int result = 8 + 2345;
        result = result / 3;
        result = result % 5;
        result = result * 5;
        System.out.println("Final result: "+result);// result = 20
    }
}
