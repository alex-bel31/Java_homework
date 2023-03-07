package homework;

public class KidsProduct extends Product {

    private int minAge;
    private boolean hypoallergenic;

    public KidsProduct(String name, int price, int quantity, String unit,
                       int minAge, boolean hypoallergenic) {
        super(name, price, quantity, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic; 
    }

    @Override
    public String toString() {
        return String.format("%s MinAge: %d Hypoallergenic: %b ",
                             super.toString(), this.minAge, this.hypoallergenic);
    }
    
}
