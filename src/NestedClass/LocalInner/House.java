package NestedClass.LocalInner;
//Write a Java program to create a class called House with a method calculateArea(). Inside this method,
// define a local class Room with a method getArea() that calculates and returns the area of the room
// (length * width). Instantiate the Room class and call the getArea() method from within calculateArea()
public class House {
    public void calculateArea(){
        class Room{
            private double length;
            private double width;

            public Room(double length, double width) {
                this.length = length;
                this.width = width;
            }

            public double getArea(){
                return length * width;
            }
        }
        Room room = new Room(34.44,64.55);
        System.out.println("House area :"+ room.getArea());
    }

    public static void main(String[] args) {
        House house = new House();
        house.calculateArea();
    }
}
