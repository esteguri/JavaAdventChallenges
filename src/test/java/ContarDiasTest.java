import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class ContarDiasTest {

    @Test
    public void preDate() {
        Calendar date = Calendar.getInstance();
        date.set(2021,Calendar.DECEMBER,1,0,0,0);

        Assert.assertEquals(24, ContarDias.main(date));
    }

    @Test
    public void equalsDate() {
        Calendar date = Calendar.getInstance();
        date.set(2021,Calendar.DECEMBER,25,0,0,1);

        Assert.assertEquals(0, ContarDias.main(date));
    }

    @Test
    public void postDate() {
        Calendar date = Calendar.getInstance();
        date.set(2021,Calendar.DECEMBER,26,0,0,1);

        Assert.assertEquals(-1, ContarDias.main(date));
    }
}