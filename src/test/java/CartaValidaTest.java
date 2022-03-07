import org.junit.Assert;
import org.junit.Test;

public class CartaValidaTest {

    @Test
    public void main() {
        Assert.assertTrue(CartaValida.main("bici coche (balón) bici coche peluche"));
        Assert.assertTrue(CartaValida.main("(muñeca) consola bici"));
        Assert.assertFalse(CartaValida.main("bici coche (balón bici coche"));
        Assert.assertFalse(CartaValida.main("peluche (bici [coche) bici coche balón"));
        Assert.assertFalse(CartaValida.main("(peluche {) bici"));
        Assert.assertFalse(CartaValida.main("() bici"));
    }
}