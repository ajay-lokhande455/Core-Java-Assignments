package Encapsulation.Car;
//Write a Java program to create a class called Car with private instance variables company_name, model_name,
// year, and mileage. Provide public getter and setter methods to access and modify the company_name, model_name,
// and year variables. However, only provide a getter method for the mileage variable.
public class Car {
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    public Car(String company_name, String model_name, int year, double mileage) {
        this.company_name = company_name;
        this.model_name = model_name;
        this.year = year;
        this.mileage = mileage;
    }
}
class TestCar{
    public static void main(String[] args) {
        Car car = new Car("Toyota","Camry",2020,1500.00);
        System.out.println("Company Name: " + car.getCompany_name());
        System.out.println("Model Name: " + car.getModel_name());
        System.out.println("Year: " + car.getYear());
        System.out.println("Mileage: " + car.getMileage());

        System.out.println("Modify company name, model name, and year using setter methods");
        car.setCompany_name("Honda");
        car.setModel_name("Accord");
        car.setYear(2022);

        System.out.println("Display updated values");
        System.out.println("Updated Company Name: " + car.getCompany_name());
        System.out.println("Updated Model Name: " + car.getModel_name());
        System.out.println("Updated Year: " + car.getYear());
        System.out.println("Mileage remains unchanged: " + car.getMileage());
    }
}

