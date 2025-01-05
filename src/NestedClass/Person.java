package NestedClass;
//Write a Java program to create an outer class called Person with an inner class Address. The Address class
// should have a constructor that takes parameters city and state. Create an instance of Address from the Person
// class and print the address details.
public class Person {
    public class Address{
        private String city;
        private String state;

        public Address(String city, String state) {
            this.city = city;
            this.state = state;
        }
        public void showDetail(){
            System.out.println("City : " + city);
            System.out.println("State : " + state);
        }
    }

    public static void main(String[] args) {
        Person person =  new Person();
        Person.Address address = person. new Address("Pune","Maharstra");
        address.showDetail();
    }
}
