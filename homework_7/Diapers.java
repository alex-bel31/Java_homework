package homework;

public class Diapers extends KidsProduct {

    private int size;
    private int minimumWeight;
    private int weightLimit;
    private String type;

    public Diapers(String name, int price, int quantity, String unit, int minAge, boolean hypoallergenic,
                   int size, int minimumWeight, int weightLimit, String type) {
        super(name, price, quantity, unit, minAge, hypoallergenic);
        this.size = size;
        this.minimumWeight = minimumWeight;
        this.weightLimit = weightLimit;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s Size: %d Weight Limit: %d Minimum Weight: %d Type: %s",
                             super.toString(), this.size, this.minimumWeight, this.weightLimit, this.type);
    }
}
