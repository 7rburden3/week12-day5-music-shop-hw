import org.junit.Before;
import org.junit.Test;
import shop.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Classical", 1.00, 3.00);
    }

    @Test
    public void getType() {
        assertEquals("Classical", sheetMusic.getType());
    }

    @Test
    public void getPriceBuy() {
        assertEquals(1.00, sheetMusic.getPriceBuy(), 0.01);
    }

    @Test
    public void getPriceSell() {
        assertEquals(3.00, sheetMusic.getPriceSell(), 0.01);
    }

    @Test
    public void calculateMarkUp() {
        assertEquals(2.00, sheetMusic.calculateMarkUp(), 0.01);
    }
}
