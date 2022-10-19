import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MenuClasicoTest {

    @Test
    @DisplayName("WHEN a menuClasico is created THEN it should have the right precioFinal")
    public void test1() {
        // GIVEN
        var precioFinalEsperado = 12.00;
        var menu = new MenuClasico(12.00);
        // WHEN
        var precioFinal = menu.getPrecioFinal();
        // THEN
        assertEquals(precioFinalEsperado, precioFinal);
    }
}

