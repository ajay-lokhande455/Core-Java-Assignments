package StaticMembers;
//Write a Java program to create a class called "Initializer" with a static block that initializes a static
// variable 'initialValue' to 1000. Print the value of 'initialValue' before and after creating an instance of
// "Initializer".
public class Initializer {
    static int initialValue;

    // Static block to initialize the static variable
    static {
        initialValue = 1000;
        System.out.println("Static block executed. initialValue set to: " + initialValue);
    }

    public static void main(String[] args) {
        // Printing the value of initialValue before creating an instance
        System.out.println("Value of initialValue before creating an instance: " + Initializer.initialValue);

        // Creating an instance of Initializer
        Initializer obj = new Initializer();

        // Printing the value of initialValue after creating an instance
        System.out.println("Value of initialValue after creating an instance: " + Initializer.initialValue);
    }
}
