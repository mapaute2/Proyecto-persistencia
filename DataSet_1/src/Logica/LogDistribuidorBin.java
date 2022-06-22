/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Archivos.DistribuidorBin;
import Clases.Distribuidor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class LogDistribuidorBin {
    
    DistribuidorBin objDistribuidorBin = new DistribuidorBin();
    
    public boolean ValidarId(Distribuidor objDistribuidor) throws IOException {
        ArrayList<Distribuidor> ArrayDistribuidor = new ArrayList<Distribuidor>();

        if (objDistribuidor.getId() > 0){
            ArrayDistribuidor.add(objDistribuidor);
            return objDistribuidorBin.GrabarDistribuidorBin(ArrayDistribuidor);
        }
        return false;
    }

    public void ListarDistribuidor(ArrayList<Distribuidor> ArrayDistribuidor) throws IOException, FileNotFoundException, ClassNotFoundException{
        objDistribuidorBin.ImportarDistribuidorBin(ArrayDistribuidor);
    }  
}
