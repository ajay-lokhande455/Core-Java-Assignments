package java8Feature.defaultMethod;

public class demo3 {
    public static void main(String[] args) {
        interface Addition{
            public int add(int a, int b);
            default void getAdd(){
                System.out.println("Default method execute");
            }
        }
        class TestAdd implements Addition{
            @Override
            public int add(int a, int b) {
                return a + b;
            }

            // override default methods

            @Override
            public void getAdd() {
                Addition.super.getAdd();
                System.out.println("test the default override method");
            }
        }
        TestAdd testAdd = new TestAdd();
        System.out.println(testAdd.add(34,44));
        testAdd.getAdd();
    }
}
