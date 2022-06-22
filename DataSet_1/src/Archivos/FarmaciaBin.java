/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import Clases.Farmacia;
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
public class FarmaciaBin {
    
    static String fichero = "FarmaciaBin.dat";
    
    public static boolean GrabarFarmaciaBin(ArrayList<Farmacia> ArrayFarmacia) throws FileNotFoundException, IOException{
        ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream(fichero,false));  
        for (Farmacia ObjFarmacia:  ArrayFarmacia){
            // grabar todo el objeto
            oos.writeObject(ObjFarmacia);
        }
        oos.close();  
        return true;
    }
    
    public static void ImportarFarmaciaBin(ArrayList<Farmacia> ArrayFarmacia) throws FileNotFoundException, IOException, ClassNotFoundException{
        try
        {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(fichero));
            Farmacia aux = (Farmacia) ois.readObject();
            while (aux!=null){
                if (aux instanceof Farmacia) {               
                    ArrayFarmacia.add((Farmacia)aux);
                }
                aux = (Farmacia) ois.readObject();
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
    
    public static void AddFarmaciaBin (ArrayList<Farmacia> ArrayFarmacia)
    {
        try
        {
            MiObjectOutputStream oos = new MiObjectOutputStream(
                    new FileOutputStream(fichero,true));
            for (Farmacia ObjFarmacia:  ArrayFarmacia){
                oos.writeUnshared(ObjFarmacia);
        }
        oos.close();  
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }   
}
