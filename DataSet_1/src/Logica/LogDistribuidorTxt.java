/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Archivos.DistribuidorTxt;
import Clases.Distribuidor;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class LogDistribuidorTxt {
    
    DistribuidorTxt objDistribuidorTxt = new DistribuidorTxt();
    
    public boolean ValidarId(Distribuidor objDistribuidor) throws IOException {
        
        if (objDistribuidor.getId() > 0){       
            return objDistribuidorTxt.AgregarDistribuidor(objDistribuidor);
        }
        return false;
    }
    
    public void ListarDistribuidor(ArrayList<Distribuidor> ArrayDistribuidor){
        objDistribuidorTxt.LeerDistribuidor(ArrayDistribuidor);
    }
}
