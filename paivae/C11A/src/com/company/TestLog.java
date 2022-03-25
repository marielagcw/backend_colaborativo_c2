package com.company;


import java.sql.*;

public class TestLog {

    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:h2:" +
                "./Database/my", "root", "myPassword");
        Statement stmt = con.createStatement();


        //Código para crear una tabla. Elimina la tabla si esta ya existe y la
        //vuelve a crear
        String createSql = "DROP TABLE IF EXISTS TEST;\n" +
                "CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255));\n" +
                "INSERT INTO TEST VALUES(1, 'Hello');\n" +
                "INSERT INTO TEST VALUES(2, 'World');\n";
        stmt.execute(createSql);

        //Codigo para consultar todos los registros de la tabla TEST
        String sql = "select * from TEST";
        ResultSet rd = stmt.executeQuery(sql);

        //Código para recorrer el resultado de la consulta
        while (rd.next()) {
            System.out.println(rd.getInt(1) + rd.getString(2));
        }
    }
}