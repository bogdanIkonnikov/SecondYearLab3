package third;

import first.Consignment;
import first.PackedSet;
import first.PackedWeightProduct;
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

    private static boolean countBFDHelper(PackedSet packedSet, Filter filter){
        for (Weightable product : packedSet.getWeightables()) {
            if (filter.apply(product.getName()) && !(product instanceof PackedSet)) {
                return true;
            }
            if (product instanceof PackedSet && countBFDHelper((PackedSet) product, filter)){
                return true;
            }
        }
        return false;
    }

    public static int countByFilterDeep(Consignment consignment, Filter filter){
        int count = 0;
        for (Weightable product : consignment.getWeightables()) {
            if (filter.apply(product.getName()) && !(product instanceof PackedSet)) {
                count++;
            }
            if (product instanceof PackedSet && countBFDHelper((PackedSet) product, filter)){
                count++;
            }
        }
        return count;
    }

    private static boolean checkAllWeightedHelper(PackedSet packedSet){
        for (Weightable product : packedSet.getWeightables()) {
            if (product.getClass() != PackedWeightProduct.class && product.getClass() != PackedSet.class) {
                return false;
            }
            if (product.getClass() == PackedSet.class && !checkAllWeightedHelper((PackedSet) product)){
                return false;
            }
        }
        return true;
    }

    public static boolean checkAllWeighted(Consignment consignment){
        for (Weightable product : consignment.getWeightables()) {
            if (!(product instanceof PackedWeightProduct) && !(product instanceof PackedSet)) {
                return false;
            }
            if (product instanceof PackedSet && (!checkAllWeightedHelper((PackedSet) product))){
                return false;
            }
        }
        return true;

    }
}
