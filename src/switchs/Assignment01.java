package switchs;

public class Assignment01 {
    //Take a number from user and print the month name corresponding to that number.
    // (Use switch statement)
    public static void main(String[] args) {
        int number = 12 ;
        switch (number){
            case 1 -> System.out.println("jan");
            case 2 -> System.out.println("Feb");
            case 3 -> System.out.println("Mar");
            case 4 -> System.out.println("Apr");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("Jun");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("Aug");
            case 9 -> System.out.println("Sep");
            case 10 -> System.out.println("oct");
            case 11-> System.out.println("Nov");
            case 12-> System.out.println("Dec");
            default -> System.out.println("invalid ");
        }
    }
}
