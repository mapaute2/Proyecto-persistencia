/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Clases.Distribuidor;
import Clases.Farmacia;
import Logica.LogFarmaciaDB;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class DataBaseFar {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ArrayList<Farmacia> ArrayFarmacia = new ArrayList<Farmacia>();
        LogFarmaciaDB objLogFarmaciaDB = new LogFarmaciaDB();
        Distribuidor objDistribuidor = new Distribuidor();
        //entrada
        ArrayFarmacia.add(new Farmacia(1,"cuxibamba",100,"Loja",objDistribuidor));
        ArrayFarmacia.add(new Farmacia(2,"sana sana",250,"Quito",objDistribuidor));
        ArrayFarmacia.add(new Farmacia(3,"fybeca",70,"Guayaquil",objDistribuidor));
        
        objLogFarmaciaDB.InsertarFarmacia(ArrayFarmacia);
        
        ArrayFarmacia = new ArrayList<Farmacia>();
        ArrayFarmacia.removeAll(ArrayFarmacia);
        
        objLogFarmaciaDB.RecuperarFarmacia(ArrayFarmacia);

        for (Farmacia objFarmacia: ArrayFarmacia)
            System.out.println(objFarmacia.toString());          
    }
}
