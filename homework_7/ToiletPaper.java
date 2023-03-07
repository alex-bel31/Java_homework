package homework;

public class ToiletPaper extends HygienProduct {

    private int layers;

    public ToiletPaper(String name, int price, int quantity, String unit, int piecesPerPack, int layers) {
        super(name, price, quantity, unit, piecesPerPack);
        this.layers = layers;
    }

    @Override
    public String toString() {
        return String.format("%s Layers: %d ",
                             super.toString(), this.layers);
    }
}
