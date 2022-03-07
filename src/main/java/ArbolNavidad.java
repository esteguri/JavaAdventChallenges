import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* 04 Arbol de Navidad
¡Es hora de poner el árbol de navidad en casa! 🎄
Para ello vamos a crear una función que recibe la altura del árbol, que será un entero positivo del 1 a, como máximo, 100.

Si le pasamos el argumento 5, se pintaría esto:

____*____
___***___
__*****__
_*******_
*********
____#____
____#____

Creamos un triángulo de asteriscos * con la altura proporcionada y, a los lados, usamos el guión bajo _ para los espacios.
Es muy importante que nuestro árbol siempre tenga la misma longitud por cada lado.
Todos los árboles, por pequeños o grandes que sean, tienen un tronco de dos líneas de #.

Otro ejemplo con un árbol de altura 3:

__*__
_***_
*****
__#__
__#__

Ten en cuenta que el árbol es un string y necesitas los saltos de línea \n para cada línea para que se forme bien el árbol.
* */
public class ArbolNavidad {

    private final static int alturaTronco = 2;

    public static String main(int altura){
        if(altura < 1 || altura > 100) return "";
        StringBuilder arbol = new StringBuilder();
        construirArbol(arbol, altura);
        construirTronco(arbol, altura);
        return arbol.toString();
    }

    private static void construirArbol(StringBuilder arbol, int altura) {
        int ancho = altura - 1;
        for (int i = 1; i <= altura * 2; i+=2) {
            arbol.append("_".repeat(ancho));
            arbol.append("*".repeat(i));
            arbol.append("_".repeat(ancho));
            arbol.append("\n");
            ancho--;
        }
    }

    private static void construirTronco(StringBuilder arbol, int altura) {
        int ancho = altura - 1;
        for (int i = 1; i <= alturaTronco; i++) {
            arbol.append("_".repeat(ancho));
            arbol.append("#");
            arbol.append("_".repeat(ancho));
            if(alturaTronco != i) arbol.append("\n");
        }
    }
}
