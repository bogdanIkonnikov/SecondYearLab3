package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeightGoodsTest {
    WeightGoods weightGoods = new WeightGoods("Name", "Description");
    @Test
    public void getNameTest(){
        Assertions.assertEquals("Name", weightGoods.getName());
    }
    @Test
    public void getDescriptionTest(){
        Assertions.assertEquals("Description", weightGoods.getDescription());
    }
}
