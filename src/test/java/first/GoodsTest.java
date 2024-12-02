package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GoodsTest {
    Goods goods = new Goods("Товар", "Описание");
    @Test
    public void getNameTest(){
        Assertions.assertEquals("Товар", goods.getName());
    }
    @Test
    public void getDescriptionTest(){
        Assertions.assertEquals("Описание", goods.getDescription());
    }
}
