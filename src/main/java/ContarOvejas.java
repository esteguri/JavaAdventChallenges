import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
* 01 Contar Ovejas
* Considera una lista/array de ovejas. Cada oveja tiene un nombre y un color.
* Haz una función que devuelva una lista con todas las ovejas que sean de color rojo y que además su nombre contenga tanto las letras n Y a,
* sin importar el orden, las mayúsculas o espacios.
* */
public class ContarOvejas {

    public static List<Oveja> main(List<Oveja> ovejas) {
        return ovejas.stream().filter(oveja -> {
            String name = oveja.getName().toLowerCase();
            return oveja.getColor().equals("rojo") && name.contains("a") && name.contains("n");
        }).collect(Collectors.toList());
    }

}

@Data
@AllArgsConstructor
class Oveja {
    private String name;
    private String color;
}