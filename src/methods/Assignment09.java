package methods;

public class Assignment09 {
    //Write a program to print the factorial of a number by defining a method named 'Factorial'.
    //Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
    //4! = 1*2*3*4 = 24
    //3! = 3*2*1 = 6
    //2! = 2*1 = 2
    //Also,
    //1! = 1
    //0! = 0
    public static long factorialOfNo(int number)
    {

        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;

    }
    public static void main(String[] args) {
        int number = 4;
        long fact = factorialOfNo(number);

        for (int i = number; i > 0 ; i--) {
            System.out.println(i + "! = " + factorialOfNo(i));
        }
    }
}
