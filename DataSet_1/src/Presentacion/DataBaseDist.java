/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Clases.Distribuidor;
import Logica.LogDistribuidorDB;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *  @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class DataBaseDist {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ArrayList<Distribuidor> ArrayDistribuidor = new ArrayList<Distribuidor>();
        LogDistribuidorDB objLogDistribuidorDB = new LogDistribuidorDB();
        //entrada
        ArrayDistribuidor.add(new Distribuidor(1,"El empalme","sauces norte","0959813702"));
        ArrayDistribuidor.add(new Distribuidor(2,"Disfasur","la argelia","093245611"));
        ArrayDistribuidor.add(new Distribuidor(3,"Diempec","las pitas","987612345"));
        
        objLogDistribuidorDB.InsertarDistribuidor(ArrayDistribuidor);
        
        //limpiando arrayList
        ArrayDistribuidor = new ArrayList<Distribuidor>();
        ArrayDistribuidor.removeAll(ArrayDistribuidor);
        
        objLogDistribuidorDB.RecuperarDistribuidor(ArrayDistribuidor);

        for (Distribuidor objDistribuidor: ArrayDistribuidor)
            System.out.println(objDistribuidor.toString());
                             
    }
}
