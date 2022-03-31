import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class InvertirCriptomonedasTest {

    private final List<Integer> pricesBtc = Arrays.asList(39, 18, 29, 25, 34, 32, 5);
    private final List<Integer> pricesEth  = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
    private final List<Integer> pricesDoge  = Arrays.asList(18, 15, 12, 11, 9, 7);
    private final List<Integer> pricesAda  = Arrays.asList(3, 3, 3, 3, 3);

    @Test
    public void pricesBtc() {
        Assert.assertEquals(InvertirCriptomonedas.main(pricesBtc), 16);
    }

    @Test
    public void pricesEth() {
        Assert.assertEquals(InvertirCriptomonedas.main(pricesEth), 60);
    }

    @Test
    public void pricesDoge() {
        Assert.assertEquals(InvertirCriptomonedas.main(pricesDoge), -1);
    }

    @Test
    public void pricesAda() {
        Assert.assertEquals(InvertirCriptomonedas.main(pricesAda), -1);
    }
}