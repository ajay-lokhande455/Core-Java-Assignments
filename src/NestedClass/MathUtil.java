package NestedClass;
//Write a Java program to create an outer class called 'MathUtil' with a static nested class Calculator. The
// Calculator class should have a static method add(int a, int b) that returns the sum of a and b. Call the add()
// method from the main method.
public class MathUtil {
    static class Calculator{
       public static int add(int a, int b){
           return a + b;
       }
    }

    public static void main(String[] args) {
        System.out.println(Calculator.add(1,3));
    }
}
