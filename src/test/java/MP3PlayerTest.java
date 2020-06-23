import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MP3PlayerTest {

    Stereo stereo1;
    Stereo stereo2;
    MP3Player mp3Player1;
    MP3Player mp3Player2;

    @Before
    public void before(){
        mp3Player1 = new MP3Player();
        mp3Player2 = new MP3Player();
        stereo1 = new Stereo("Sony Stereo");
        stereo2 = new Stereo("Philips Stereo");
    }

    @Test
    public void connect() {
        assertEquals("Sony Stereo",mp3Player1.connect(stereo1));
    }
}