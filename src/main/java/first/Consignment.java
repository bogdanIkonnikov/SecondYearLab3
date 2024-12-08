package first;

import first.iface.Weightable;

public class Consignment {
    private final String description;
    private final Weightable[] weightables;
    private final String name;

    public Consignment(String description, Weightable[] weightables) {
        this.description = description;
        this.weightables = weightables;
        this.name = "default";
    }
    public Consignment(String description, Weightable[] weightables, String name) {
        this.description = description;
        this.weightables = weightables;
        this.name = name;
    }

    public Weightable[] getWeightables() {
        return weightables;
    }

    public double getWeight(){
        double weight = 0;
        for (Weightable obj : weightables) {
            weight += obj.getGrossWeight();
        }
        return weight;
    }
}
