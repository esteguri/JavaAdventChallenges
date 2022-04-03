import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MaquinaCambioTest {

    @Test
    public void getCoins51() {
        List<Integer> coins = Arrays.asList(1, 0, 0, 0, 0, 1);
        Assert.assertEquals(coins, MaquinaCambio.main(51));
    }

    @Test
    public void getCoins3() {
        List<Integer> coins = Arrays.asList(1, 1, 0, 0, 0, 0);
        Assert.assertEquals(coins, MaquinaCambio.main(3));
    }

    @Test
    public void getCoins5() {
        List<Integer> coins = Arrays.asList(0, 0, 1, 0, 0, 0);
        Assert.assertEquals(coins, MaquinaCambio.main(5));
    }

    @Test
    public void getCoins16() {
        List<Integer> coins = Arrays.asList(1, 0, 1, 1, 0, 0);
        Assert.assertEquals(coins, MaquinaCambio.main(16));
    }

    @Test
    public void getCoins100() {
        List<Integer> coins = Arrays.asList(0, 0, 0, 0, 0, 2);
        Assert.assertEquals(coins, MaquinaCambio.main(100));
    }
}