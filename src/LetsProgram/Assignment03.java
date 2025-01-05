package LetsProgram;

public class Assignment03 {
    public static void main(String[] args) {
        /*
        Print the following pattern on the screen
                    *****
                     ***
                      *
                     ***
                    *****
         */
        for(int row = 1; row > 5; row--){
            for (int space = 1; space <=row ; space++) {
                System.out.println(" ");
            }
            for (int col = 5; col <=row ; col++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
