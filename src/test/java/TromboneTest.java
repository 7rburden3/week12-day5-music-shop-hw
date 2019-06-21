import instruments.Trombone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {

    Trombone trombone;

    @Before
    public void before(){
        trombone = new Trombone("Bass", "Brass", 300.00, 500.00, "I have one big valve");
    }

    @Test
    public void getType() {
        assertEquals("Bass", trombone.getType());
    }

    @Test
    public void getColour() {
        assertEquals("Brass", trombone.getColour());
    }

    @Test
    public void getPriceBuy() {
        assertEquals(300.00, trombone.getPriceBuy(), 0.01);
    }

    @Test
    public void getPriceSell() {
        assertEquals(500.00, trombone.getPriceSell(), 0.01);
    }

    @Test
    public void getMarkUp() {
        assertEquals(200.00, trombone.getMarkUp(), 0.01);
    }

    @Test
    public void play() {
        assertEquals("Paarrrrppp! I'm a trombone!", trombone.play());
    }

    @Test
    public void getValves() {
        assertEquals("I have one big valve", trombone.getValves());
    }
}
