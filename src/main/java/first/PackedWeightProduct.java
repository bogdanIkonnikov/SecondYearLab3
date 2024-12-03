package first;

public class PackedWeightProduct extends WeightProduct {
    private final double weight;
    private final Pack pack;

    public PackedWeightProduct(WeightProduct weightGoods, double weight, Pack pack) {
        super(weightGoods.getName(), weightGoods.getDescription());
        this.weight = weight;
        this.pack = pack;
    }
    public double getNetWeight(){
        return weight;
    }
    public double getGrossWeight(){
        return weight + pack.getWeight();
    }

}
