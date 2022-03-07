import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class RegalosEnCartaTest {

    private static final String carta = "bici coche balón _playstation bici coche peluche";
    private Map<String, Integer> expected = new HashMap<>();

    @Before
    public void setUp() {
        expected.put("bici", 2);
        expected.put("coche", 2);
        expected.put("balón", 1);
        expected.put("peluche", 1);
    }

    @Test
    public void main() {
        Map<String, Integer> result = RegalosEnCarta.main(carta);
        Assert.assertEquals(expected,result);
    }
}