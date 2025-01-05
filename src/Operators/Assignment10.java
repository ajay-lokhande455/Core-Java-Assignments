package Operators;

public class Assignment10 {
    public static void main(String[] args) {
        // Initial values of variables 'a' and 'b'
        int a = 6;
        int b = 8;

        // Displaying the initial values of 'a' and 'b'
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping using a third variable 'temp'
        int temp = a;
        a = b;
        b = temp;

        // Displaying the swapped values of 'a' and 'b'
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
}
