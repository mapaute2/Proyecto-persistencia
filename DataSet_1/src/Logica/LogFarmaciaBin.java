/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Archivos.FarmaciaBin;
import Clases.Farmacia;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class LogFarmaciaBin {
    
    FarmaciaBin objFarmaciaBin = new FarmaciaBin();
    
    public boolean ValidarId(Farmacia objFarmacia) throws IOException {
        ArrayList<Farmacia> ArrayFarmacia = new ArrayList<Farmacia>();
        
        if (objFarmacia.getId() > 0){ 
            ArrayFarmacia.add(objFarmacia);
            return objFarmaciaBin.GrabarFarmaciaBin(ArrayFarmacia);
        }
        return false;
    }

    public void ListarFarmacia(ArrayList<Farmacia> ArrayFarmacia) throws IOException, FileNotFoundException, ClassNotFoundException{
        objFarmaciaBin.ImportarFarmaciaBin(ArrayFarmacia);   
    } 
}
