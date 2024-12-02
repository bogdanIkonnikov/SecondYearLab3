package first;

public class Consignment {
    private final String description;
    private final Object[] objects;

    public Consignment(String description, Object[] objects) {
        this.description = description;
        this.objects = objects;
    }

    public double getWeight(){
        double weight = 0;
        for (Object obj : objects) {
            if (obj.getClass() == PackedSet.class)
            {
                weight += ((PackedSet) obj).getGrossWeight();
            }
            if (obj.getClass() == PackedPieceGoods.class)
            {
                weight += ((PackedPieceGoods) obj).getGrossWeight();
            }
            if (obj.getClass() == PackedWeightGoods.class)
            {
                weight += ((PackedWeightGoods) obj).getGrossWeight();
            }
        }
        return weight;
    }
}
