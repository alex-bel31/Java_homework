package homework;

public class Eggs extends Food {

    private int count;

    public Eggs(String name, int price, int quantity, String unitOfMeasure, int count) {
        super(name, price, quantity, unitOfMeasure);
        this.count = count;
    }

    @Override
    public String toString() {
        return String.format("%s Count: %d ",
                             super.toString(), this.count);
    }
    
}
