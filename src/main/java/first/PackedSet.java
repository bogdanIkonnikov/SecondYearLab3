package first;

import first.iface.Weightable;

public class PackedSet implements Weightable {
    private final Pack pack;
    private final Weightable[] objects;

    public PackedSet(Weightable[] objects, Pack pack) {
        this.objects = objects;
        this.pack = pack;
    }

    @Override
    public double getNetWeight() {
        double netWeight = 0;
        for (Weightable obj : objects) {
            netWeight += obj.getGrossWeight();
        }
        return netWeight;
    }

    @Override
    public double getGrossWeight() {
        double grossWeight = pack.getWeight();
        for (Weightable obj : objects) {
            grossWeight += obj.getGrossWeight();
        }
        return grossWeight;
    }
}
