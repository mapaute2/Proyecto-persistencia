/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Archivos.FarmaciaTxt;
import Clases.Farmacia;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class LogFarmaciaTxt {
    
    FarmaciaTxt objFarmaciaTxt = new FarmaciaTxt();
    
    public boolean ValidarId(Farmacia objFarmacia) throws IOException {

        if (objFarmacia.getId() > 0){           
            return objFarmaciaTxt.AgregarFarmacia(objFarmacia);
        }
        return false;
    }
    
    public void ListarFarmacia(ArrayList<Farmacia> ArrayFarmacia){
        objFarmaciaTxt.LeerFarmacia(ArrayFarmacia);
    }
}
