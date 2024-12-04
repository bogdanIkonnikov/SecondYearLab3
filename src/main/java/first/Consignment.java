package first;

import first.iface.Weightable;

public class Consignment {
    private final String description;
    private final Weightable[] objects;

    public Consignment(String description, Weightable[] objects) {
        this.description = description;
        this.objects = objects;
    }

    public double getWeight(){
        double weight = 0;
        for (Weightable obj : objects) {
            weight += obj.getGrossWeight();
        }
        return weight;
    }
}
