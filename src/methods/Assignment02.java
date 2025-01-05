package methods;
//Define a program to find out whether a given number is even or odd.
public class Assignment02 {
    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("is Even : "+isEven(12));
    }
}
