package userinput;

import java.util.Scanner;

public class Assignment07 {
    public static void main(String[] args) {
        /*Take two different string input and print them in same line. E.g.-
        INPUT : Codes
        Dope
        OUTPUT : CodesDope */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two String names : ");
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(str1+str2);
    }
}
