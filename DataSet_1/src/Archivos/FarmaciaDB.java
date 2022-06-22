/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import Clases.Farmacia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class FarmaciaDB {
    
    DATConexion con = new DATConexion();
    ResultSet rs;
    PreparedStatement ps = null;
    
    public boolean InsertarFarmaciaDB(Farmacia objFarmacia) {
        String sql = "INSERT INTO Farmacia (nombre, num_medicamentos, ciudad, dis ) "
                + "VALUES (?,?,?,?)";
        try {
            ps = con.AbrirConexion().prepareStatement(sql);
            ps.setString(1, objFarmacia.getNombre());
            ps.setInt(2, objFarmacia.getNum_medicamentos());
            ps.setString(3, objFarmacia.getCiudad());
            //ps.setString(4, objFarmacia.getDis());
            ps.execute();
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(3);
            }
        } 
    }

    public ResultSet RecuperarFarmacia() throws ClassNotFoundException, SQLException {
        java.sql.Statement st = con.AbrirConexion().createStatement();
        String sentencia = "SELECT * FROM Farmacia";
        rs = st.executeQuery(sentencia);
        return rs;
    }
}
