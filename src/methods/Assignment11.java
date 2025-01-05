package methods;
//Define a method to print the prime factors of a number.
public class Assignment11 {
     static void primeFact(int num) {
         for (int i = 2; i <= num; i++) {
             while (num % i == 0) {
                 System.out.println(i + " ");
                 num = num / i;
             }
         }

     }


    public static void main(String[] args) {
        int number =20;
        System.out.println("prime factors of "+number+"are:");
        primeFact(number);
    }
}
