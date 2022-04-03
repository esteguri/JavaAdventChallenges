import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MaquinaCambio {

    private static final List<Integer> COINS = Arrays.asList(50, 20, 10, 5, 2, 1);

    public static List<Integer> main(Integer change){
        AtomicInteger currentChange = new AtomicInteger(change);

        List<Integer> result = COINS.stream().map(coin -> {
            if(coin > currentChange.get() || currentChange.get() == 0) return 0;
            int penny = (int) Math.floor(currentChange.get() / coin);
            currentChange.set(currentChange.get() - (penny * coin));
            return penny;
        }).collect(Collectors.toList());

        Collections.reverse(result);
        return result;
    }

}
