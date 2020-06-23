import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CDPlayerTest {

    CDPlayer cdPlayer1;
    CDPlayer cdPlayer2;

    @Before
    public void setUp() throws Exception {
        cdPlayer1 = new CDPlayer();
        cdPlayer2 = new CDPlayer();
    }

    @Test
    public void playCD() {
        cdPlayer1.setCdName("Iron Maiden");
        assertEquals("I am playing Iron Maiden", cdPlayer1.playCD());
    }

    @Test
    public void getCdName__null() {
        assertEquals(null,cdPlayer1.getCdName());
    }

    @Test
    public void setCdName() {
        cdPlayer1.setCdName("Iron Maiden");
        assertEquals("Iron Maiden", cdPlayer1.getCdName());
    }
}