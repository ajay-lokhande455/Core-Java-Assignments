package NestedClass;

public class ABC {
    class XYZ{
        int i = 111;
    }

    public static void main(String[] args) {
       ABC abc = new ABC();
       ABC.XYZ xyz = abc.new XYZ();
        System.out.println(xyz.i);
    }
}

