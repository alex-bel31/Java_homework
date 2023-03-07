package homework;

public class Milk extends Food {

    private double fat;

    public Milk(String name, int price, int quantity, String unitOfMeasure, double fat) {
        super(name, price, quantity, unitOfMeasure);
        this.fat = fat;
    }

    @Override
    public String toString() {
        return String.format("%s Fat: %f", super.toString(), fat);
    }

}
