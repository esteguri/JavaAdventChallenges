import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SistemaOperativoTest {

    @Test
    public void test1() {
        List<String> files = Arrays.asList("photo", "postcard", "photo", "photo", "video");
        List<String> expectedFiles = Arrays.asList("photo", "postcard", "photo(1)", "photo(2)", "video");

        Assert.assertEquals(SistemaOperativo.main(files), expectedFiles);
    }

    @Test
    public void test2() {
        List<String> files = Arrays.asList("file", "file", "file", "game", "game");
        List<String> expectedFiles = Arrays.asList("file", "file(1)", "file(2)", "game", "game(1)");

        Assert.assertEquals(SistemaOperativo.main(files), expectedFiles);
    }

    @Test
    public void test3() {
        List<String> files = Arrays.asList("file", "file(1)", "icon", "icon(1)", "icon(1)");
        List<String> expectedFiles = Arrays.asList("file", "file(1)", "icon", "icon(1)", "icon(1)(1)");

        Assert.assertEquals(SistemaOperativo.main(files), expectedFiles);
    }
}