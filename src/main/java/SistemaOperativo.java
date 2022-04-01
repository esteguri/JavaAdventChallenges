import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SistemaOperativo {

    public static List<String> main(List<String> files) {
        Map<String, Integer> values = new HashMap<>();
        return files.stream().map((file) -> {
            int count = values.get(file) == null ? 0 : values.get(file) + 1;
            values.put(file, count);
            return count > 0 ? file + "(" + count + ")" : file;
        }).collect(Collectors.toList());
     }

}
