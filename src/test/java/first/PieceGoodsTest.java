package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PieceGoodsTest {
    PieceGoods pieceGoods = new PieceGoods("Name", "Description", 23);
    @Test
    public void getNameTest(){
        Assertions.assertEquals("Name", pieceGoods.getName());
    }
    @Test
    public void getDescriptionTest(){
        Assertions.assertEquals("Description", pieceGoods.getDescription());
    }
    @Test
    public void getWeightTest(){
        Assertions.assertEquals(23, pieceGoods.getWeight());
    }
}
