import instruments.Guitar;
import instruments.Piano;
import instruments.Trombone;
import org.junit.Before;
import org.junit.Test;
import shop.GuitarStrings;
import shop.ISell;
import shop.SheetMusic;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MusicStoreTest {

    MusicStore musicStore;
    Piano piano;
    SheetMusic sheetMusic;
    GuitarStrings guitarStrings;
    Trombone trombone;


    @Before
    public void before(){
        musicStore = new MusicStore();
        trombone = new Trombone("Bass", "Brass", 300.00, 500.00, "I have one big valve");
        sheetMusic = new SheetMusic("Classical", 1.00, 3.00);
        guitarStrings = new GuitarStrings("Steel", 5.00, 12.00);
        piano = new Piano("upright", "black", 500.00, 800.00, 88);

    }

    @Test
    public void musicStoreStartsEmpty(){
        assertEquals(0, musicStore.inventoryCount());
    }

    @Test
    public void canAddInventoryToMusicStore(){
        musicStore.addToInventory(piano);
        //System.out.println(musicStore.getInventory());
        assertEquals(1, musicStore.inventoryCount());
    }

    @Test
    public void canRemoveInventoryFromMusicStore(){
        musicStore.addToInventory(piano);
        musicStore.addToInventory(sheetMusic);
        musicStore.removeFromInventory(piano);
        //System.out.println(musicStore.getInventory());
        assertEquals(1, musicStore.inventoryCount());
    }

}
