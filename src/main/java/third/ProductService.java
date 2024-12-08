package third;

import first.Consignment;
import first.PackedSet;
import first.PackedWeightProduct;
import first.WeightProduct;
import first.iface.Weightable;
import second.interfaces.Filter;

public class ProductService {

    public static int countByFilter(Consignment consignment, Filter filter){
        int count = 0;
        for (Weightable product : consignment.getWeightables()) {
            if (filter.apply(product.getName())) {
                count++;
            }
        }
        return count;
    }

    private static boolean countBFDSet(PackedSet packedSet, Filter filter){
        for (Weightable product : packedSet.getWeightables()) {
            if (filter.apply(product.getName())) {
                return true;
            }
            if (product.getClass() == PackedSet.class && countBFDSet((PackedSet) product, filter)){
                return true;
            }
        }
        return false;
    }

    public static boolean countByFilterDeep(Consignment consignment, Filter filter){
        for (Weightable product : consignment.getWeightables()) {
            if (filter.apply(product.getName())) {
                return true;
            }
            if (product.getClass() == PackedSet.class && countBFDSet((PackedSet) product, filter)){
                return true;
            }
        }
        return false;
    }

    private static boolean cAllWeightedHelper(PackedSet packedSet){
        for (Weightable product : packedSet.getWeightables()) {
            if (product.getClass() != PackedWeightProduct.class && product.getClass() != PackedSet.class) {
                return false;
            }
            if (product.getClass() == PackedSet.class && !cAllWeightedHelper((PackedSet) product)){
                return false;
            }
        }
        return true;
    }

    public static boolean checkAllWeighted(Consignment consignment){
        for (Weightable product : consignment.getWeightables()) {
            if (product.getClass() != PackedWeightProduct.class && product.getClass() != PackedSet.class) {
                return false;
            }
            if (product.getClass() == PackedSet.class && (!cAllWeightedHelper((PackedSet) product))){
                return false;
            }
        }
        return true;

    }
}
