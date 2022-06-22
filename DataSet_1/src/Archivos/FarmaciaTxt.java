package Archivos;



import Clases.Farmacia;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class FarmaciaTxt {
    
    public boolean AgregarFarmacia(Farmacia objFarmacia) throws IOException{
       File f = new File("Farmacia.txt");
       FileWriter fw = new FileWriter(f,false);
       BufferedWriter bw = new BufferedWriter(fw);
       bw.write(Integer.toString(objFarmacia.getId())+",");
       bw.write(objFarmacia.getNombre()+",");
       bw.write(objFarmacia.getNum_medicamentos()+"\n");
       bw.write(objFarmacia.getCiudad()+"\n");
       bw.close();
       fw.close();
       return true;
    }
    
    public  ArrayList<Farmacia> LeerFarmacia(ArrayList<Farmacia> ArrayFarmacia){        
        File f = new File("Farmacia.txt");        
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {            
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()){
                     Farmacia Objtmp = new Farmacia(
                             Integer.valueOf(st.nextToken()),
                             st.nextToken(), 
                             st.countTokens(),
                             st.nextToken()
                             //st.nextToken()
                     );                     
                     ArrayFarmacia.add(Objtmp);
                }
                
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
        return ArrayFarmacia;
    }
    
}
