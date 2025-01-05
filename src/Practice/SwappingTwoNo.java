package Practice;

public class SwappingTwoNo {
    int a;
    int b;

    public SwappingTwoNo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void swapping (){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping : a = "+ a + " b = "+ b);
    }


    public static void main(String[] args) {

        SwappingTwoNo swap = new SwappingTwoNo(10,20);
        System.out.println("before swapping : ");
        System.out.println(swap.getA());
        System.out.println(swap.getB());


        swap.swapping();

    }
}

