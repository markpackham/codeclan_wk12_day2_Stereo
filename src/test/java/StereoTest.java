import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StereoTest {

    Stereo stereo1;
    Stereo stereo2;

    @Before
    public void setUp() throws Exception {
        stereo1 = new Stereo();
        stereo2 = new Stereo();
    }

    @Test
    public void getCdName() {
        assertEquals(null,stereo1.getCdName());
    }

    @Test
    public void setCdName() {
        stereo1.setCdName("Korn");
        assertEquals("Korn",stereo1.getCdName());
    }

    @Test
    public void getRecordName() {
        assertEquals(null,stereo1.getRecordName());
    }

    @Test
    public void setRecordName() {
        stereo1.setRecordName("The Birdie Song");
        assertEquals("The Birdie Song", stereo1.getRecordName());
    }

    @Test
    public void playCD() {
    }

    @Test
    public void playRecord() {
    }
}