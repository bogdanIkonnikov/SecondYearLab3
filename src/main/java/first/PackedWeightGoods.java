package first;

public class PackedWeightGoods extends WeightGoods {
    private final double weight;
    private final Pack pack;

    public PackedWeightGoods(WeightGoods weightGoods, double weight, Pack pack) {
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
