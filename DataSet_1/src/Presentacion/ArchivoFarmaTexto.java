/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Clases.Distribuidor;
import Clases.Farmacia;
import Logica.LogFarmaciaTxt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class ArchivoFarmaTexto {
    
    static LogFarmaciaTxt objLogFarmaciaTxt = new LogFarmaciaTxt();
    
    public static void main(String[] args) throws IOException {
        
        AgregarFarmaciaTxt();
        ListarFarmaciaTxt();
    }
    
    
    void menuArhivoTexto() throws IOException{
        Scanner sc = new Scanner(System.in);
        int op=0;
        while (op<4){
            System.out.println("Agregar     1");
            System.out.println("Eliminar    2");
            System.out.println("Listar      3");
            System.out.println("Salir       4");
            op = sc.nextInt();
            
            switch(op){
                case 1: AgregarFarmaciaTxt(); break;
                case 2: EliminarFarmaciaTxt(); break;
                case 3: ListarFarmaciaTxt(); break;
            }
        }
    }

    static private void AgregarFarmaciaTxt() throws IOException {
        LogFarmaciaTxt objLogFarmaciaTxt = new LogFarmaciaTxt();
        Farmacia objFarmacia = new Farmacia();
        Distribuidor objDistribuidor = new Distribuidor();
        // entrada
        objFarmacia.setId(1);
        objFarmacia.setNombre("Cuxibamba");
        objFarmacia.setNum_medicamentos(100);
        objFarmacia.setCiudad("Loja");
        objFarmacia.setDis(objDistribuidor);
        
        
        if (objLogFarmaciaTxt.ValidarId(objFarmacia))
            System.out.println("Farmacia agregado");
        else
            System.out.println("codigo Farmacia no valido");
    }
    
    private void EliminarFarmaciaTxt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static private void ListarFarmaciaTxt() {
        ArrayList<Farmacia> ArrayFarmacia = new ArrayList<Farmacia>();
        objLogFarmaciaTxt.ListarFarmacia(ArrayFarmacia);
        for (Farmacia tmpFarmacia : ArrayFarmacia)
            System.out.println(tmpFarmacia.toString());
    }
}
