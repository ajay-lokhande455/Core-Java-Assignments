package classAndObject;
//. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances
// of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter
// methods and print the updated values.
public class Dog {
    public String name;
    public String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void displayDogInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        Dog dog1 = new Dog("Max", "Bulldog");

        System.out.println("Original dog1");
        dog.displayDogInfo();

        System.out.println("\nOriginal dog2");
        dog.displayDogInfo();

        dog.setName("Charlie");
        dog.setBreed("Labrador");

        dog1.setName("Rocky");
        dog1.setBreed("German Shepherd");

        System.out.println("\nUpdated dog1");
        dog.displayDogInfo();

        System.out.println("\nUpdated dog2");
        dog.displayDogInfo();
    }
}
