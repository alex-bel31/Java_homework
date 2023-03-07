package homework;

public class Bread extends Food {
    
    private String feelSick;

    public Bread(String name, int price, int quantity, String unitOfMeasure, String feelSick) {
        super(name, price, quantity, unitOfMeasure);
        this.feelSick = feelSick;
    }
    
    @Override
    public String toString() {
        return String.format("%s FeelSick: %s ",
                             super.toString(), this.feelSick);
    }
}
