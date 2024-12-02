package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PackedWeightGoodsTest {
    Pack pack = new Pack("name", 1);
    WeightGoods weightGoods = new WeightGoods("name", "description");
    PackedWeightGoods packedWeightGoods = new PackedWeightGoods(weightGoods, 30, pack);

    @Test
    public void getNetWeight(){
        Assertions.assertEquals(30, packedWeightGoods.getNetWeight());
    }
    @Test
    public void getGrossWeight(){
        Assertions.assertEquals(31, packedWeightGoods.getGrossWeight());
    }
}
