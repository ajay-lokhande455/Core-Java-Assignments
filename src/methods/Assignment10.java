package methods;

public class Assignment10 {
    //Print the multiplication table of 15 using recursion.
        public static void printMultiplicationTable(int n, int i){
            {
                if (n <= 10)
                    System.out.println(n + " * " + i +  " = " + ( n * i));
                printMultiplicationTable(n,i + 1);
            }
    }

    public static void main(String[] args) {
        int n = 15;
       printMultiplicationTable(n,1);
    }
}
