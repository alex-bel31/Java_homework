package homework;

public class Product {
    private String name;
    private int price;
    private int quantity;
    private String unit;
    

    public Product(String name, int price, int quantity, String unit){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String toString() {
        return String.format("Name: %s  Price: %d  Quantity: %d Unit: %s",
                this.name, this.price,this.quantity, this.unit);
    }
}
