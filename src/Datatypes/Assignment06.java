package Datatypes;

public class Assignment06 {
    public static void main(String[] args) {
        char ch = 'd';
        int AsciiValue = (int) ch;
        int newAsciiValue = AsciiValue + 3;
        char newChar = (char) newAsciiValue;

        System.out.println("The character equivalant 'd'+3 is : "+newChar);
    }
}
