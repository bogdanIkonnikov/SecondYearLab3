package first;

public class PieceGoods extends Goods{
    private final double weight;
    public PieceGoods(String name, String description, double weight) {
        super(name, description);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
