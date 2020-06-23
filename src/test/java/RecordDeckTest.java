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
}