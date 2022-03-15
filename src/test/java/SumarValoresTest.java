import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumarValoresTest {

    @Test
    public void main1() {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 2);

        List<Integer> result = SumarValores.main(numbers, 10);

        assert result != null;
        assertEquals(3, (int) result.get(0));
        assertEquals(7, (int) result.get(1));
    }

    @Test
    public void main2() {
        List<Integer> numbers = Arrays.asList(-3, -2, 7, -5);

        List<Integer> result = SumarValores.main(numbers, 10);

        assertNull(result);
    }

    @Test
    public void main3() {
        List<Integer> numbers = Arrays.asList(0, 2, 2, 3, -1, 1, 5);

        List<Integer> result = SumarValores.main(numbers, 6);

        assert result != null;
        assertEquals(1, (int) result.get(0));
        assertEquals(5, (int) result.get(1));
    }
}