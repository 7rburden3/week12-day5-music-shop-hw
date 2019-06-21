import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Electric", "Red", 250.00, 500.00, "I have six strings");
    }


    @Test
    public void getType() {
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void getColour() {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void getPriceBuy() {
        assertEquals(250.00, guitar.getPriceBuy(), 0.01);
    }

    @Test
    public void getPriceSell() {
        assertEquals(500.00, guitar.getPriceSell(), 0.01);
    }

    @Test
    public void getMarkUp() {
        assertEquals(250.00, guitar.getMarkUp(), 0.01);
    }

    @Test
    public void play() {
        assertEquals("I am a six string guitar yeehaw!", guitar.play());
    }

    @Test
    public void getStrings() {
        assertEquals("I have six strings", guitar.getStrings());
    }
}
