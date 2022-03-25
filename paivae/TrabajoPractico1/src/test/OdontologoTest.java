import com.company.Odontologo;
import com.company.OdontologoServicio;
import com.company.baseDatos.OdontologoH2;
import org.junit.jupiter.api.*;

import java.util.List;

public class OdontologoTest {

    @Test
    public void listarOdontologos() throws Exception{
        OdontologoServicio servicio = new OdontologoServicio(new OdontologoH2());
        List<Odontologo> listado = servicio.listar();

        Assertions.assertTrue(listado.size() != 0);
    }
}
