package methods;
//Define a method to find out if number is prime or not.
public class Assignment07 {
    public static boolean primeOrNot(int number){
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <=number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 13;
        boolean isPrime = true;
        System.out.println("Is prime : "+ primeOrNot(number));

    }
}
