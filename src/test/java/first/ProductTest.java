package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
    Product product = new Product("Товар", "Описание");
    @Test
    public void getNameTest(){
        Assertions.assertEquals("Товар", product.getName());
    }
    @Test
    public void getDescriptionTest(){
        Assertions.assertEquals("Описание", product.getDescription());
    }
}
