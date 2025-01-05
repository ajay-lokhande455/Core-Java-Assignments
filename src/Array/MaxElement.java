package Array;

public class MaxElement {
    public static void main(String[] args) {
        int[] array = {100, 20, 30, 90, 32, 0, -123, 123};
        int min = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        // for min value

        for (int temp : array) {
            if (temp > maximum) {
                maximum = temp;
            }
        }
        // For max value

        for (int temp : array){
            if (temp < min){
                min = temp;
            }
        }


        System.out.println("Array min element " + min);
        System.out.println("Array max element " + maximum);
        //output : 90
    }
}
