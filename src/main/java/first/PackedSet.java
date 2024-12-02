package first;

public class PackedSet {
    private final Pack pack;
    private final Object[] objects;
    public PackedSet(Object[] objects, Pack pack){
        this.objects = objects;
        this.pack = pack;
    }
    public double getNetWeight(){
        double netWeight = 0;
        for (Object obj : objects) {
            if (obj.getClass() == PackedSet.class)
            {
                netWeight += ( (PackedSet) obj).getGrossWeight();
            }
            if (obj.getClass() == PackedPieceGoods.class)
            {
                netWeight += ( (PackedPieceGoods) obj).getGrossWeight();
            }
            if (obj.getClass() == PackedWeightGoods.class)
            {
                netWeight += ( (PackedWeightGoods) obj).getGrossWeight();
            }
        }
        return netWeight;
    }

    public double getGrossWeight(){
        double netWeight = pack.getWeight();
        for (Object obj : objects) {
            if (obj.getClass() == PackedSet.class)
            {
                netWeight += ((PackedSet) obj).getGrossWeight();
            }
            if (obj.getClass() == PackedPieceGoods.class)
            {
                netWeight += ((PackedPieceGoods) obj).getGrossWeight();
            }
            if (obj.getClass() == PackedWeightGoods.class)
            {
                netWeight += ((PackedWeightGoods) obj).getGrossWeight();
            }
        }
        return netWeight;
    }
}
