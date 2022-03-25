package com.company;

import com.company.baseDatos.OdontologoDAO;

import java.sql.SQLException;
import java.util.List;

public class OdontologoServicio {

    private OdontologoDAO<Odontologo> dao;

    public OdontologoServicio(OdontologoDAO<Odontologo> dao) {
        this.dao = dao;
    }

    public Odontologo guardar(Odontologo odontologo){
        return this.dao.guardar(odontologo);
    }

    public List<Odontologo> listar(){
        return this.dao.listar();
    }

    public void cerrar() throws SQLException {
        this.dao.cerrarConexion();
    }
}
