package AbstractKeyword;
//Write a Java program to create an abstract class Animal with an abstract method called sound().
// Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to
// make a specific sound for each animal.
public abstract class Animal {
    public abstract void sound();
}
class Lion extends Animal{
    @Override
    public void sound() {
        System.out.println("Lion make sound..");
    }
}
class Tiger extends Animal{
    @Override
    public void sound() {
        System.out.println("Tiger make sound....");
    }
}
class TestSound{
    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.sound();

        Animal animal1 = new Tiger();
        animal1.sound();
    }
}
