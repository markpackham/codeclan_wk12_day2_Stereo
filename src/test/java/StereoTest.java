import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StereoTest {

    Stereo stereo1;
    Stereo stereo2;

    @Before
    public void setUp() throws Exception {
        stereo1 = new Stereo("Sony Stereo");
        stereo2 = new Stereo("Philips Stereo");
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
    public void isTurnedOn(){
        assertEquals(true, stereo1.isTurnedOn());
    }

    @Test
    public void isTurnedOff(){
        stereo1.setTurnedOn(false);
        assertEquals(false, stereo1.isTurnedOn());
    }

    @Test
    public void getVolumeLevel(){
        assertEquals(0,stereo1.getVolumeLevel());
    }

    @Test
    public void setVolumeLevel(){
        stereo1.setVolumeLevel(7);
        assertEquals(7,stereo1.getVolumeLevel());
    }

    @Test
    public void turnOn(){
        stereo1.turnOn();
        assertEquals(true,stereo1.isTurnedOn());
    }

    @Test
    public void turnOff(){
        stereo1.turnOff();
        assertEquals(false,stereo1.isTurnedOn());
    }

    @Test
    public void playCD() {
        stereo1.setCdName("Korn");
        assertEquals("I'm a Stereo playing Korn", stereo1.playCD());
    }

    @Test
    public void playRecord() {
        stereo1.setRecordName("The Birdie Song");
        assertEquals("I'm a Stereo spinning The Birdie Song",stereo1.playRecord());
    }

    @Test
    public void getStereoName() {
        assertEquals("Sony Stereo", stereo1.getStereoName());
    }

    @Test
    public void setStereoName() {
        stereo1.setStereoName("Setlhare Stereo");
        assertEquals("Setlhare Stereo", stereo1.getStereoName());
    }
}