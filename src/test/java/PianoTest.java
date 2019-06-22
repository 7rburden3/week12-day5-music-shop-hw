import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(InstrumentType.KEYBOARD,"upright", "black", 500.00, 800.00, 88);
    }

    @Test
    public void hasType(){
        assertEquals("upright", piano.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasPriceBuy(){
        assertEquals(500.00, piano.getPriceBuy(), 0.01);
    }

    @Test
    public void hasPriceSell(){
        assertEquals(800.00, piano.getPriceSell(), 0.01);
    }

    @Test
    public void canPlayPiano(){
        assertEquals("I'm an 88 string folk guitar", piano.play());
    }

    @Test
    public void hasNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void getMarkUp(){
        assertEquals(300.00, piano.getMarkUp(), 0.01);
    }

}
