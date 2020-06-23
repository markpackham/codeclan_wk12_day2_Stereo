import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RadioTest {

    Radio radio1;

    @Before
    public void setUp() throws Exception {
        radio1 = new Radio("Something FM");
    }

    @Test
    public void tune() {
        assertEquals("Something FM", radio1.tune());
    }
}