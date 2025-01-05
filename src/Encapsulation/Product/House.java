package Encapsulation.Product;
//Write a Java program to create a class called House with private instance variables address, numberOfRooms,
// and area. Provide public getter and setter methods to access and modify these variables.
// Add a method called calculatePrice() that returns the price of the house based on its area and a
// price per square meter.
public class House {
    private String address;
    private int numberOfRooms;
    private double area;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calculatePrice(double sizePerSquareMeter){
        if (sizePerSquareMeter>0){
            return area * sizePerSquareMeter;
        }
        else {
            System.out.println("Price per square meter must be positive.");
        }
        return 0;
    }
}
class HouseInfo{
    public static void main(String[] args) {
        House house = new House();

        house.setAddress("Pune, India");
        house.setNumberOfRooms(4);
        house.setArea(1250.00);
        System.out.println("------------------------------");

        System.out.println("house detail");
        System.out.println("Address : "+house.getAddress());
        System.out.println("Number of rooms :"+house.getNumberOfRooms());
        System.out.println("area : "+house.getArea());
        System.out.println("--------------------------------------------------");

        System.out.println("Calculate house price");
        double priceOfSquareMeter = 1500.00;
        double housePrice = house.calculatePrice(priceOfSquareMeter);
        System.out.println("Price of the House: $" + housePrice);
    }
}
