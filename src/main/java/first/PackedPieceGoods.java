package first;

public class PackedPieceGoods extends PieceGoods{
    private final int quantity;
    private final Pack pack;

    public PackedPieceGoods(PieceGoods pieceGoods, int quantity, Pack pack) {
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
