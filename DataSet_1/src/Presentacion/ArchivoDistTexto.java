/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;


import Clases.Distribuidor;
import Logica.LogDistribuidorTxt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class ArchivoDistTexto {
    
    static LogDistribuidorTxt objLogDistribuidorTxt = new LogDistribuidorTxt();
    
    public static void main(String[] args) throws IOException {
        
        AgregarDistribuidorTxt();
        ListarDistribuidorTxt();
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
                case 1: AgregarDistribuidorTxt(); break;
                case 2: EliminarDistribuidorTxt(); break;
                case 3: ListarDistribuidorTxt(); break;
            }
        }
    }

    static private void AgregarDistribuidorTxt() throws IOException {
        LogDistribuidorTxt objLogDistribuidorTxt = new LogDistribuidorTxt();
        Distribuidor objDistribuidor = new Distribuidor();
        // entrada
        objDistribuidor.setId(1);
        objDistribuidor.setNombre("El empalme");
        objDistribuidor.setDireccion("Sauces Norte");
        objDistribuidor.setNumero("0959813702");
        
        if (objLogDistribuidorTxt.ValidarId(objDistribuidor))
            System.out.println("distribuidora agregado");
        else
            System.out.println("codigo distribuidora no valido");
    }
    
    private void EliminarDistribuidorTxt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static private void ListarDistribuidorTxt() {
        ArrayList<Distribuidor> ArrayDistribuidor = new ArrayList<Distribuidor>();
        objLogDistribuidorTxt.ListarDistribuidor(ArrayDistribuidor);
        for (Distribuidor tmpDistribuidor : ArrayDistribuidor)
            System.out.println(tmpDistribuidor.toString());
    }
}
