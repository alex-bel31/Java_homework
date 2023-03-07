package homework;

public class Food extends Product {

    private String expirationDate;

    public Food(String name, int price, int quantity, String unitOfMeasure) {
        super(name, price, quantity, unitOfMeasure);
    }

    public String toString(){
        return String.format("%s  Expiration Date: %s",super.toString(), this.expirationDate);
    }
    
}


