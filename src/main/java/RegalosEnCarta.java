import javax.swing.text.html.Option;
import java.util.*;

/*
* 02 Regalos en la carta
* Te ha llegado una carta ✉️ con todos los regalos que debes preparar. El tema es que es una cadena de texto y es muy difícil de leer 😱.
* ¡Menos mal que han puesto cada regalo separado por espacio! (aunque ten cuidado, porque al ser niños, igual han colado más espacios de la cuenta)
* Encima nos hemos dado cuenta que algunas palabras vienen con un _ delante de la palabra, por ejemplo _playstation, que significa que está tachado y
* no se tiene que contar.
* Transforma el texto a un objeto que contenga el nombre de cada regalo y las veces que aparece
* */
public class RegalosEnCarta {

    public static Map<String,Integer> main(String carta){
        List<String> regalos = Arrays.asList(carta.trim().split(" "));

        Map<String,Integer> result = new HashMap<>();

        regalos.forEach(regalo -> {
            if(!regalo.trim().contains("_")){
                Optional<Integer> valorActual = Optional.ofNullable(result.get(regalo));
                if(valorActual.isPresent()){
                    result.put(regalo, valorActual.get()+1);
                }else {
                    result.put(regalo, 1);
                }
            }
        });

        return result;
    }

}
