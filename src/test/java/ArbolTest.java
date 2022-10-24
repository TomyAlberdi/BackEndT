import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArbolTest {

    @Test
    void test1() {
        // GIVEN
        var alto = 200;
        var ancho = 400;
        var color = "verde";
        var tipo = "Ornamental";
        // WHEN
        var arbol = new Arbol(alto,ancho,color,tipo);
        // THEN
        assertEquals(arbol.alto(),alto);
        assertEquals(arbol.ancho(),ancho);
        assertEquals(arbol.color(),color);
        assertEquals(arbol.tipo(),tipo);
    }
}
