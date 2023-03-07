package homework;

public class HygienProduct extends Product {

    private int piecesPerPack;


    public HygienProduct(String name, int price,int quantity, 
                         String unit, int piecesPerPack) {
        super(name, price, quantity, unit);
        this.piecesPerPack = piecesPerPack;    
    }

    @Override
    public String toString() {
        return String.format("%s PiecesPerPack: %d ",
                              super.toString(), this.piecesPerPack);
    }
    
}
