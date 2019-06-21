import org.junit.Before;
import org.junit.Test;
import shop.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("Steel", 5.00, 12.00);
    }


    @Test
    public void getType() {
        assertEquals("Steel", guitarStrings.getType());
    }

    @Test
    public void getPriceBuy() {
        assertEquals(5.00, guitarStrings.getPriceBuy(), 0.01);
    }

    @Test
    public void getPriceSell() {
        assertEquals(12.00, guitarStrings.getPriceSell(), 0.01);
    }

    @Test
    public void calculateMarkUp() {
        assertEquals(7.00, guitarStrings.calculateMarkUp(),0.01);
    }
}
