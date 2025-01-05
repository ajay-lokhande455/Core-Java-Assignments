package Encapsulation.PersonDemo;
//Write a Java program to create a class called Person with private instance variables name, age. and country.
// Provide public getter and setter methods to access and modify these variables.
public class Person {
    private String name;
    private int age;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
class Test{
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ajay");
        person.setAge(21);
        person.setCountry("India");

        System.out.println("Name : "+person.getName());
        System.out.println("Age: "+person.getAge());
        System.out.println("country : "+person.getCountry());
    }

}
