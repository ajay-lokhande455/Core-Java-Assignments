package ifelse;

import java.util.Scanner;

public class Assignment06 {
    public static void main(String[] args) {
        //Take input of age of 3 people by user and determine oldest and youngest among them.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter different three people age : ");
        int people1 = sc.nextInt();
        int people2 = sc.nextInt();
        int people3 = sc.nextInt();

        if(people1>people2 && people1>people3){
            System.out.println("First is oldest than second and third");
        }
        else if (people2>people1 && people2>people3){
            System.out.println("second is oldest than first and thirst");
        }
        else if (people3>people1 && people3>people2) {
            System.out.println("Third is oldest than first and second");
        }
    }
}
