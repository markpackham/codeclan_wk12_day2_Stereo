import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecordDeckTest {

    RecordDeck recordDeck1;
    RecordDeck recordDeck2;

    @Before
    public void setUp() throws Exception {
        recordDeck1 = new RecordDeck();
        recordDeck2 = new RecordDeck();
    }

    @Test
    public void playRecord() {
        recordDeck1.setRecordName("Little Richard");
        assertEquals("I am spinning Little Richard", recordDeck1.playRecord());
    }

    @Test
    public void getRecordName() {
        assertEquals(null, recordDeck1.getRecordName());
    }

    @Test
    public void setRecordName() {
        recordDeck1.setRecordName("Little Richard");
        assertEquals("Little Richard", recordDeck1.getRecordName());
    }

    @Test
    public void isTurnedOn(){
        assertEquals(true, recordDeck1.isTurnedOn());
    }

    @Test
    public void isTurnedOff(){
        recordDeck2.setTurnedOn(false);
        assertEquals(false, recordDeck2.isTurnedOn());
    }

    @Test
    public void getVolumeLevel(){
        assertEquals(0,recordDeck1.getVolumeLevel());
    }

    @Test
    public void setVolumeLevel(){
        recordDeck1.setVolumeLevel(7);
        assertEquals(7,recordDeck1.getVolumeLevel());
    }

    @Test
    public void turnOn(){
        recordDeck1.turnOn();
        assertEquals(true,recordDeck1.isTurnedOn());
    }

    @Test
    public void turnOff(){
        recordDeck1.turnOff();
        assertEquals(false,recordDeck1.isTurnedOn());
    }
}