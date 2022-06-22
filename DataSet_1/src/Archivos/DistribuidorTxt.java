/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import Clases.Distribuidor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class DistribuidorTxt {
    
    public boolean AgregarDistribuidor(Distribuidor objDistribuidor) throws IOException{
        
       File f = new File("Distribuidor.txt");
       FileWriter fw = new FileWriter(f,false);
       BufferedWriter bw = new BufferedWriter(fw);
       bw.write(Integer.toString(objDistribuidor.getId())+",");
       bw.write(objDistribuidor.getNombre()+",");
       bw.write(objDistribuidor.getDireccion()+"\n");
       bw.write(objDistribuidor.getNumero()+"\n");
       bw.close();
       fw.close();
       return true;
    }
    
    public  ArrayList<Distribuidor> LeerDistribuidor(ArrayList<Distribuidor> ArrayDistribuidor){        
        File f = new File("Distribuidor.txt");        
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {            
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()){
                     Distribuidor Objtmp = new Distribuidor(
                             Integer.valueOf(st.nextToken()),
                             st.nextToken(), 
                             st.nextToken(),
                             st.nextToken()                         
                     );                     
                     ArrayDistribuidor.add(Objtmp);
                }    
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close();
        }
        return ArrayDistribuidor;
    }  
}
