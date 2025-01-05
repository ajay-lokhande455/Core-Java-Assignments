package demos;

public class perfectNumber {
    public static void main(String[] args) {
        int number = 3;
        int sum = 0;
        for (int i = 1; i <= number/2 ; i++) {
            if(number % i == 0){
                sum += i;
            }
        }
        System.out.println(sum == number ? "perfect" : "notPerfect");
    }
}
