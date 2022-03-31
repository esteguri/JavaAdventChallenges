import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;

public class InvertirCriptomonedas {

    public static int index = 0;

    public static int main(List<Integer> prices){
        index = 0;
        BinaryOperator<Integer> getMaxProfit = (acc, price) -> {
            int priceSlice = Collections.max(prices.subList(index, prices.size())) - price;
            InvertirCriptomonedas.index++;
            return acc > priceSlice ? acc : priceSlice;
        };

        int result = prices.stream().reduce(0, getMaxProfit );
        return result == 0 ? -1 : result;
    }

}
