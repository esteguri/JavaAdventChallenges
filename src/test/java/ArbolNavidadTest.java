import org.junit.Assert;
import org.junit.Test;

public class ArbolNavidadTest {

    private final String expectedFive =
            "____*____\n" +
            "___***___\n" +
            "__*****__\n" +
            "_*******_\n" +
            "*********\n" +
            "____#____\n" +
            "____#____";

    private final String expectedThree =
            "__*__\n" +
            "_***_\n" +
            "*****\n" +
            "__#__\n" +
            "__#__";

    @Test
    public void buildTreeWithFive() {
        Assert.assertEquals(expectedFive, ArbolNavidad.main(5));
    }

    @Test
    public void buildTreeWithThree() {
        Assert.assertEquals(expectedThree, ArbolNavidad.main(3));
    }

    @Test
    public void buildThreeWithNumberMajor100() {
        Assert.assertEquals("", ArbolNavidad.main(101));
    }

    @Test
    public void buildThreeWithNumberMinor100() {
        Assert.assertEquals("", ArbolNavidad.main(-1));
    }
}