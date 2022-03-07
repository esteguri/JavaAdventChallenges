import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContarOvejasTest {

    List<Oveja> ovejas = new ArrayList<Oveja>();

    @Before
    public void setup(){
        ovejas.add(new Oveja("Pepe", "rojo"));
        ovejas.add(new Oveja("Pedro", "gris"));
        ovejas.add(new Oveja("Sandro", "rojo"));
        ovejas.add(new Oveja("Caseniro", "rojo"));
    }

    @Test
    public void testMain() {
        List<Oveja> result = ContarOvejas.main(ovejas);
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.stream().anyMatch(oveja -> oveja.getName().equals("Caseniro")));
        Assert.assertTrue(result.stream().anyMatch(oveja -> oveja.getName().equals("Sandro")));
    }
}