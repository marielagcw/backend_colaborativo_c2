package com.company.baseDatos;

import com.company.Odontologo;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class OdontologoH2 implements OdontologoDAO<Odontologo>{

    private Logger logger = Logger.getLogger(OdontologoH2.class);
    private Connection connection = null;

    public OdontologoH2() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        this.connection = DriverManager.getConnection("jdbc:h2:~/clinica;INIT=RUNSCRIPT FROM 'database.sql'", "root", "myPassword");
    }

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        try{
            String SQLQuery = "INSERT INTO Clinica (matricula, nombre, apellido) VALUES (?,?,?)";

            PreparedStatement statement = this.connection.prepareStatement(SQLQuery);
            statement.setInt(1, odontologo.getNroMatricula());
            statement.setString(2, odontologo.getNombre());
            statement.setString(3,odontologo.getApellido());

            statement.executeUpdate();

        }
        catch (Exception e){
            logger.error("Hubo un error al insertar datos, " + e);
        }

        return odontologo;
    }

    @Override
    public List<Odontologo> listar() {

        List<Odontologo> listadoOdontologos = new ArrayList<>();

        try{
            String SQLQuery = "SELECT * FROM Clinica";

            PreparedStatement statement = this.connection.prepareStatement(SQLQuery);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Odontologo odontologo = new Odontologo(null,null, null);

                odontologo.setNroMatricula(resultSet.getInt("matricula"));
                odontologo.setNombre(resultSet.getString("nombre"));
                odontologo.setApellido(resultSet.getString("apellido"));

                listadoOdontologos.add(odontologo);
            }
        }
        catch (Exception e){
            logger.error("Hubo un error a buscar los odontologos, " + e);
        }

        return listadoOdontologos;
    }

    public void cerrarConexion() throws SQLException {
        this.connection.close();
    }
}
