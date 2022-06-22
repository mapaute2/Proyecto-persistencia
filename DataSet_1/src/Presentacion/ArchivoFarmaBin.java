/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Clases.Distribuidor;
import Clases.Farmacia;
import Logica.LogFarmaciaBin;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class ArchivoFarmaBin {
    
    static LogFarmaciaBin objLogFarmaciaBin = new LogFarmaciaBin();
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        AgregarFarmaciaBin();
        ListarFarmaciaBin();
    }
            
    void menuArhivoTexto() throws IOException, FileNotFoundException, ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        int op=0;
        while (op<4){
            System.out.println("Agregar     1");
            System.out.println("Eliminar    2");
            System.out.println("Listar      3");
            System.out.println("Salir       4");
            op = sc.nextInt();
            
            switch(op){
                case 1: AgregarFarmaciaBin(); break;
                case 2: EliminarFarmaciaBin(); break;
                case 3: ListarFarmaciaBin(); break;
            }
        }
    }

    static private void AgregarFarmaciaBin() throws IOException {
        
        Farmacia objFarmacia = new Farmacia();
        Distribuidor objDistribuidor = new Distribuidor();
        // entrada
        objFarmacia.setId(5);
        objFarmacia.setNombre("Cuxibamba");
        objFarmacia.setNum_medicamentos(100);
        objFarmacia.setCiudad("Loja");
        objFarmacia.setDis(objDistribuidor);
        
        if (objLogFarmaciaBin.ValidarId(objFarmacia))
            System.out.println("Farmacia agregado");
        else
            System.out.println("codigo Farmacia no valido");
    
    }

    private void EliminarFarmaciaBin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static private void ListarFarmaciaBin() throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Farmacia> ArrayFarmacia = new ArrayList<Farmacia>();
        objLogFarmaciaBin.ListarFarmacia(ArrayFarmacia);
        for (Farmacia tmpFarmacia : ArrayFarmacia)
            System.out.println(tmpFarmacia.toString());   
    }
    
}
