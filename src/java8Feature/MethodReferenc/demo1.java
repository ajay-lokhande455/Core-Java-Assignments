package java8Feature.MethodReferenc;

public class demo1 {
    public static void main(String[] args) {
        interface Addition{
            int add(int a, int b);
        }

        Addition addition = Arithmetic::sum;
        System.out.println(addition.add(10,20));
        System.out.println(addition.add(45,66));


    }
}
