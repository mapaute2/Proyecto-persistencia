/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import Clases.Distribuidor;
import Logica.MiObjectOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class DistribuidorBin {
    
    static String fichero = "DistribuidorBin.dat";
    
    public static boolean GrabarDistribuidorBin(ArrayList<Distribuidor> ArrayDistribuidor) throws FileNotFoundException, IOException{
        ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream(fichero,false));  //elimine o cree
        for (Distribuidor ObjDistribuidor:  ArrayDistribuidor){
            // grabar todo el objeto
            oos.writeObject(ObjDistribuidor);
        }
        oos.close();  // Se cierra al terminar.
        return true;
    }
    
    public static void ImportarDistribuidorBin(ArrayList<Distribuidor> ArrayDistribuidor) throws FileNotFoundException, IOException, ClassNotFoundException{
        try
        {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            Distribuidor aux = (Distribuidor) ois.readObject();
            while (aux!=null){
                if (aux instanceof Distribuidor) {               
                    //System.out.println(aux);
                    ArrayDistribuidor.add((Distribuidor)aux);
                }
                aux = (Distribuidor) ois.readObject();
            }
            ois.close();
        }
        catch (EOFException e1)
        {
            System.out.println ("Fin de archivo");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
        
    }
    
    public static void AddDistribuidorBin (ArrayList<Distribuidor> ArrayDistribuidor)
    {
        try
        {
            // Se usa un ObjectOutputStream que no escriba una cabecera en
            // el stream.
            MiObjectOutputStream oos = new MiObjectOutputStream(
                    new FileOutputStream(fichero,true));
            // Se hace el new fuera del bucle, s�lo hay una instancia de persona.
            // Se debe usar entonces writeUnshared().
            for (Distribuidor ObjDistribuidor:  ArrayDistribuidor){
                oos.writeUnshared(ObjDistribuidor);
        }
        oos.close();  // Se cierra al terminar.
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }  
}
