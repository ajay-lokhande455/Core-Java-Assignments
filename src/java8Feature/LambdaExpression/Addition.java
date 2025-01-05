package java8Feature.LambdaExpression;

@FunctionalInterface
public interface Addition {
    int add(int a, int b);
}

class MainTest{
    public static void main(String[] args) {
        Addition addition = (a, b) -> a + b;
        System.out.println(addition.add(34,66));
    }
}
