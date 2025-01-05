package methods;
//Define two methods to print the maximum and the
// minimum number respectively among three numbers entered by user
public class Assignment01 {
     public static int maxOfThreeNumber(int number1, int number2, int number3){
        return number1>number2 && number1>number3 ? number1 :
                number2>number1 && number2>number3 ? number2 : number3 ;
    }
    public static int minOfThreeNumber(int number1, int number2, int number3){
        return number1<number2 && number1<number3 ? number1 :
                number2<number1 && number2<number3 ? number2 : number3 ;
    }
    public static void main(String[] args) {
        System.out.println("Maximum of three no is : "+ maxOfThreeNumber(10,20,30) );
        System.out.println("Minimum of three no is : "+ minOfThreeNumber(10,20,30));
    }
}
