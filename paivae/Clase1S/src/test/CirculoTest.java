import com.company.Circulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CirculoTest {

    @Test
    public void siValorEsCorrecto(){

        Circulo circulo1 = new Circulo();

        assertEquals("El valor del radio debe ser mayor que cero",circulo1.getArea(-1));
        assertEquals("El valor del radio debe ser mayor que cero",circulo1.getArea(0));
        assertEquals("El área del Circulo es 167,415 unidades",circulo1.getArea(7.3));
    }

}
