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
            if (obj.getClass() == PackedPieceProduct.class)
            {
                weight += ((PackedPieceProduct) obj).getGrossWeight();
            }
            if (obj.getClass() == PackedWeightProduct.class)
            {
                weight += ((PackedWeightProduct) obj).getGrossWeight();
            }
        }
        return weight;
    }
}
