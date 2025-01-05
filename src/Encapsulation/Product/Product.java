package Encapsulation.Product;
//Write a Java program to create a class called Product with private instance variables productName, productCode,
// and price. Provide public getter and setter methods to access and modify these variables. Add a method called
// applyDiscount() that takes a percentage and reduces the price by that percentage.
public class Product {
    private String productName;
    private String productCode;
    private double price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void discount(double percentage){
        if (percentage > 0 && percentage <= 100) {
            price -= price * (percentage / 100);
            System.out.println("Discount applied: " + percentage + "%");
            System.out.println("Price after discount :"+ price);
        }
        else {
            System.out.println("Invalid discount percentage. Must be between 0 and 100.");
        }
    }
}
class ProductInfo{
    public static void main(String[] args) {
        Product product = new Product();

        product.setProductName("Oppo_mobile");
        product.setProductCode("5847598ABC");
        product.setPrice(45000.00);

        System.out.println("Product name : "+ product.getProductName());
        System.out.println("Product code :"+ product.getProductCode());
        System.out.println("Product price : "+product.getPrice());
        System.out.println("------------------------------------------------");

        System.out.println("Product price after applied discount");
        product.discount(10.00);

    }
}
