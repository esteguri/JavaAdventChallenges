
/*
* 03 Carta Valida
* El Grinch está abriendo las cartas que iban a Santa Claus y las está dejando hechas un lío. 😱
*
* Las cartas son una cadena de texto que incluyen regalos y paréntesis ().
*
* Para saber si una carta es válida ✅, debes comprobar que los paréntesis cierran correctamente y que, además, no vayan vacíos.
*
* ¡Pero ojo! Porque el Grinch ha dejado llaves { y corchetes [ dentro de los paréntesis que hacen que no sean válidas.
* Por suerte sólo los ha dejado en medio de los paréntesis...
* */
public class CartaValida {

    public static boolean main(String carta){
        if(!carta.contains("(") || !carta.contains(")")) return false;

        String regalo = carta.substring(carta.indexOf("(") + 1, carta.indexOf(")"));

        return !(
            regalo.length() == 0
            || regalo.contains("{")
            || regalo.contains("[")
            || regalo.contains("(")
        );
    }

}
