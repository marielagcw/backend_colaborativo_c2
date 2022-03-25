package com.company.baseDatos;

import java.sql.SQLException;
import java.util.List;

public interface OdontologoDAO<T> {
    public T guardar(T t);
    public List<T> listar();
    public void cerrarConexion() throws SQLException;
}
