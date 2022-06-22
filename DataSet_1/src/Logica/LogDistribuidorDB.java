/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Archivos.DistribuidorDB;
import Clases.Distribuidor;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class LogDistribuidorDB {
    
    DistribuidorDB objDistribuidorDB = new DistribuidorDB();

    public void InsertarDistribuidor(ArrayList<Distribuidor> ArrayDistribuidor) {
        for(Distribuidor objDistribuidor:ArrayDistribuidor)
              objDistribuidorDB.InsertarDistribuidorDB(objDistribuidor);
    }

    public void RecuperarDistribuidor(ArrayList<Distribuidor> ArrayDistribuidor) throws ClassNotFoundException, SQLException {
        ResultSet rs = objDistribuidorDB.RecuperarDistribuidor();
        ResultSetMetaData rm = rs.getMetaData();
        int columnCount = rm.getColumnCount();
        ArrayList<String> columnas = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = rm.getColumnName(i);
            columnas.add(columnName);
        }
        while (rs.next()) {
            Distribuidor objAux = new Distribuidor();
            for (String columnName : columnas) {
                String value = rs.getString(columnName);
                if (columnName.equals("id")) {
                    objAux.setId(Integer.parseInt(value));
                }
                if (columnName.equals("nombre")) {
                    objAux.setNombre(value);
                }
                if (columnName.equals("direccion")) {
                    objAux.setDireccion(value);
                }
                if (columnName.equals("numero")) {
                    objAux.setNumero(value);
                }
            }
            ArrayDistribuidor.add(objAux);
        }
    }
}
