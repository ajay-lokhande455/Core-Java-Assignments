package interfaces;
//Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes
// Spacecraft, Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method
// for each of the three classes.
public interface Flyable {
    void fly_obj();
}
class  Spacecraft implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft");
    }
}
class Airplane implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("Airplane");
    }
}
class Helicopter implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("Helicopter");
    }
}
class  Main {
    public static void main(String[] args) {
        Flyable flyable = new Spacecraft();
        flyable.fly_obj();

        Flyable flyable1 = new Airplane();
        flyable1.fly_obj();

        Flyable flyable2 = new Helicopter();
        flyable2.fly_obj();
    }
}