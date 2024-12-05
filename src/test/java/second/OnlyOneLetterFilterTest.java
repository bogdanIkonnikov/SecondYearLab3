package second;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OnlyOneLetterFilterTest {
    String string = "грызу 5 помидоров каждые 5 часов";
    OnlyOneLetterFilter filter1 = new OnlyOneLetterFilter('5');
    OnlyOneLetterFilter filter2 = new OnlyOneLetterFilter('г');

    @Test
    public void char1Test(){
        Assertions.assertFalse(filter1.apply(string)); // две 5 -> false
    }

    @Test
    public void char2Test(){
        Assertions.assertTrue(filter2.apply(string)); // одна 'г' -> true
    }


}
