package java8Feature.defaultMethod;
// static method
public class demo2 {
    public static void main(String[] args) {
        interface A{
            public void square(int a);

            static void display(){
                System.out.println("default method executed");
            }
        }

        class TestSquare implements A{
            @Override
            public void square(int a) {
                System.out.println(a * a);
            }
        }
        TestSquare testsquare = new TestSquare();
        testsquare.square(5);
        A.display();
    }
}
