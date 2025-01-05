package Operators;

public class Assignment01 {
    //Length and breadth of a rectangle are 5 and 7 respectively.
    public static void main(String[] args) {
        int l = 5;
        int b = 7;

        int perimeter = 2 * (l*b);
        int area = l * b;

        System.out.println("Rectangle perimeter is "+ perimeter + " and area is " + area);
    }
}
