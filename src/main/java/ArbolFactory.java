import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    public static final Map<Integer, Arbol> arboles = new HashMap<>();

    public static Arbol getArbol(int alto,int ancho, String color, String tipo) {
        var clave = alto+ancho;
        if (!arboles.containsKey(clave)) {
            arboles.put(clave,new Arbol(alto,ancho,color,tipo));
            return arboles.get(clave);
        }
        return arboles.get(clave);
    }
}
