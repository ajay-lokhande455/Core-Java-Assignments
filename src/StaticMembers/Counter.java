package StaticMembers;
//Write a Java program to create a class called "Counter" with a static variable count. Implement a constructor
// that increments count every time an object is created. Print the value of count after creating several objects.
public class Counter {
    public static int count = 0;
    public Counter(){
        count ++;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter1 =  new Counter();
        Counter counter2 = new Counter();
        System.out.println("number of object created : "+ Counter.count);
    }
}
