package first;

public class Pack {
    private final String name;
    private final double weight;

    public Pack(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
