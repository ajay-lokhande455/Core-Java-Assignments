package classAndObject;
//Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of
// the "Person" class, set their attributes using the constructor, and print their name and age.
public class Person {
    int age;
    String name;
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    public  void display(){
        System.out.println("Person age: "+age);
        System.out.println("Person name: "+name);
    }

    public static void main(String[] args) {
        Person person = new Person(21,"Ajay");
        Person person1 = new Person(22,"aditya");
        System.out.println("Person 1");
        person.display();

        System.out.println("\nPerson 2");
        person1.display();
    }
}
