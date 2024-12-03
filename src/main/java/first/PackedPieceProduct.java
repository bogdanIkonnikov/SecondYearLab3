package first;

public class PackedPieceProduct extends PieceProduct {
    private final int quantity;
    private final Pack pack;

    public PackedPieceProduct(PieceProduct pieceGoods, int quantity, Pack pack) {
        super(pieceGoods.getName(), pieceGoods.getDescription(), pieceGoods.getWeight());
        this.quantity = quantity;
        this.pack = pack;
    }

    public double getQuantity(){
        return quantity;
    }
    public double getNetWeight(){
        return quantity * this.getWeight();
    }
    public double getGrossWeight(){
        return quantity * this.getWeight() + this.pack.getWeight();
    }

}
