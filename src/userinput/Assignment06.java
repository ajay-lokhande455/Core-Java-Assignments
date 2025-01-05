package userinput;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Assignment06 {
    public static void main(String[] args) {
        //Write a program to find square of a number.
        //E.g.-
        //INPUT : 2 OUTPUT : 4
        //INPUT : 5 OUTPUT : 25

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int number = sc.nextInt();

        int square = number * number;
        System.out.println("Square of number : "+square);
    }
}
