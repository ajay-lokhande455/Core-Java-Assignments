package interfaces;
//Write a Java program to create a Animal interface with a method called bark() that takes no arguments and
// returns void. Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".
public interface Animal {
    void bark();
}
class Dog implements Animal{
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}
class TestAnimal{
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.bark();
    }
}
