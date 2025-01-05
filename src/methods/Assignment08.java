package methods;

import java.util.Scanner;

public class Assignment08 {
    //Write a program which will ask the user to enter his/her marks (out of 100).

    //Define a method that will display grades according to the marks entered as below:

    //Marks        Grade
    //91-100         AA
    //81-90          AB
    //71-80          BB
    //61-70          BC
    //51-60          CD
    //41-50          DD
    //<=40          Fail
    public void grade(int number)
    {
        if(number>=91 && number<=100)
            System.out.println("AA");
        if(number>=81 && number<=90)
            System.out.println("AB");
        if(number>=71 && number<=80)
            System.out.println("BB");
        if(number>=61 && number<=70)
            System.out.println("BC");
        if(number>=51 && number<=60)
            System.out.println("CD");
        if(number>=41 && number<=50)
            System.out.println("DD");
        if(number<=40)
            System.out.println("Failed...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks :");
        int marks = sc.nextInt();

        Assignment08 ass = new Assignment08();
        ass.grade(marks);

    }
}
