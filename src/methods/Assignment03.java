package methods;
//A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.
public class Assignment03 {
    public static void main(String[] args) {
        System.out.println("you eligible to vote : "+isEligibleToVote(10));
    }
    public static boolean isEligibleToVote(int number){
        return number>=18;
    }
}
