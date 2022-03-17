import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class EncontrarProductoTest {

    String dataStore1 = "{\"estanteria1\":{\"cajon1\":{\"producto1\":\"coca-cola\",\"producto2\":\"fanta\",\"producto3\":\"sprite\"}},\"estanteria2\":{\"cajon1\":\"vacio\",\"cajon2\":{\"producto1\":\"pantalones\",\"producto2\":\"camiseta\"}}}";
    Map<String, Object> store = new HashMap();

    @Before
    public void setUp(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            store = mapper.readValue(dataStore1, new TypeReference<Map<String, Object>>(){});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void main() {
        Assert.assertTrue(EncontrarProducto.main(store, "camiseta"));
        Assert.assertFalse(EncontrarProducto.main(store, "medias"));
    }
}