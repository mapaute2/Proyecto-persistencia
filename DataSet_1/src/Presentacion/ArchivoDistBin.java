/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Clases.Distribuidor;
import Logica.LogDistribuidorBin;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class ArchivoDistBin {
    
    static LogDistribuidorBin objLogDistribuidorBin = new LogDistribuidorBin();
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        AgregarDistribuidorBin();
        ListarDistribuidorBin();
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
                case 1: AgregarDistribuidorBin(); break;
                case 2: EliminarDistribuidorBin(); break;
                case 3: ListarDistribuidorBin(); break;
            }
        }
    }

    static private void AgregarDistribuidorBin() throws IOException {
        
        Distribuidor objDistribuidor = new Distribuidor();
        // entrada
        objDistribuidor.setId(5);
        objDistribuidor.setNombre("El empalme");
        objDistribuidor.setDireccion("Sauces norte");
        objDistribuidor.setNumero("0959813702");
        
        if (objLogDistribuidorBin.ValidarId(objDistribuidor))
            System.out.println("Distribuidor agregado");
        else
            System.out.println("codigo Distribuidor no valido");
    
    }

    private void EliminarDistribuidorBin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static private void ListarDistribuidorBin() throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Distribuidor> ArrayDistribuidor = new ArrayList<Distribuidor>();
        objLogDistribuidorBin.ListarDistribuidor(ArrayDistribuidor);
        for (Distribuidor tmpDistribuidor : ArrayDistribuidor)
            System.out.println(tmpDistribuidor.toString());   
    }
}
