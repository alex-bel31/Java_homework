package homework;

public class Drinks extends Product {

    private String volume;


    public Drinks(String name, int price, int quantity,
                  String unitOfMeasure, String volume) {

        super(name, price, quantity, unitOfMeasure);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%s Volume: %s ",
                             super.toString(), this.volume);
    }

}
