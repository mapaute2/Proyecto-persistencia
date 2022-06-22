/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Archivos.FarmaciaDB;
import Clases.Farmacia;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class LogFarmaciaDB {
    
    FarmaciaDB objFarmaciaDB = new FarmaciaDB();

    public void InsertarFarmacia(ArrayList<Farmacia> ArrayFarmacia) {
        for(Farmacia objFarmacia:ArrayFarmacia)
              objFarmaciaDB.InsertarFarmaciaDB(objFarmacia);
    }

    public void RecuperarFarmacia(ArrayList<Farmacia> ArrayFarmacia) throws ClassNotFoundException, SQLException {
        ResultSet rs = objFarmaciaDB.RecuperarFarmacia();
        ResultSetMetaData rm = rs.getMetaData();
        int columnCount = rm.getColumnCount();
        ArrayList<String> columnas = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = rm.getColumnName(i);
            columnas.add(columnName);
        }
        while (rs.next()) {
            Farmacia objAux = new Farmacia();
            for (String columnName : columnas) {
                String value = rs.getString(columnName);
                if (columnName.equals("id")) {
                    objAux.setId(Integer.parseInt(value));
                }
                if (columnName.equals("nombre")) {
                    objAux.setNombre(value);
                }
                if (columnName.equals("numero de medicamentos")) {
                    objAux.setNum_medicamentos(Integer.parseInt(value));
                }
                if (columnName.equals("ciudad")) {
                    objAux.setCiudad(value);
                }
            }
            ArrayFarmacia.add(objAux);
        }
    } 
}
