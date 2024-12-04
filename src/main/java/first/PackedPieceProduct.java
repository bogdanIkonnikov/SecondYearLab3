package first;

import first.iface.Weightable;

public class PackedPieceProduct extends PieceProduct implements Weightable {
    private final int quantity;
    private final Pack pack;

    public PackedPieceProduct(PieceProduct pieceGoods, int quantity, Pack pack) {
        super(pieceGoods.getName(), pieceGoods.getDescription(), pieceGoods.getWeight());
        this.quantity = quantity;
        this.pack = pack;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public double getNetWeight() {
        return quantity * this.getWeight();
    }

    @Override
    public double getGrossWeight() {
        return quantity * this.getWeight() + this.pack.getWeight();
    }
}
