/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import Clases.Distribuidor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class DistribuidorDB {
    
    DATConexion con = new DATConexion();
    ResultSet rs;
    PreparedStatement ps = null;
    
    public boolean InsertarDistribuidorDB(Distribuidor objDistribuidor) {
        String sql = "INSERT INTO Distribuidor (nombre, direccion, numero) "
                + "VALUES (?,?,?)";
        try {
            ps = con.AbrirConexion().prepareStatement(sql);
            ps.setString(1, objDistribuidor.getNombre());
            ps.setString(2, objDistribuidor.getDireccion());
            ps.setString(3, objDistribuidor.getNumero());
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

    public ResultSet RecuperarDistribuidor() throws ClassNotFoundException, SQLException {
        java.sql.Statement st = con.AbrirConexion().createStatement();
        String sentencia = "SELECT * FROM Distribuidor";
        rs = st.executeQuery(sentencia);
        return rs;
    }
    
}
