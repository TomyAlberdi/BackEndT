import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class ArbolFactoryTest {
    @Test
    void test1() {
        // GIVEN
        var factory = new ArbolFactory();
        // WHEN
        var arbol1 = factory.getArbol(200,400,"verde","Ornamental");
        var arbol2 = factory.getArbol(200,400,"verde","Ornamental");
        // THEN
        assertSame(arbol1,arbol2);
    }
}
