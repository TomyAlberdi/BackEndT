import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BosqueTest {
    @Test
    void test1() {
        // GIVEN
        var bosque = new Bosque();
        var arbol = ArbolFactory.getArbol(200,400,"verde","Ornamental");
        // WHEN
        bosque.agregarArbol(arbol);
        // THEN
        assertEquals(bosque.mostrarArboles(),"Hay 1 arbol Ornamental");
    }
}
