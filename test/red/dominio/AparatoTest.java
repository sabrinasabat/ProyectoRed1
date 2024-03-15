package red.dominio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class AparatoTest {

    @Test
    void testEncender(){
        Aparato microOndas = new Aparato();
        microOndas.encender();
        assertTrue(microOndas.getEncendido());
    }

    @Test
    void testApagar(){
        Aparato microOndas = new Aparato();
        microOndas.apagar();
        assertFalse(microOndas.getEncendido());
    }
}
