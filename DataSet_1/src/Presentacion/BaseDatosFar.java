/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import java.util.Scanner;

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class BaseDatosFar {
    
    void menuArhivoTexto(){
        Scanner sc = new Scanner(System.in);
        int op=0;
        while (op<4){
            System.out.println("Agregar     1");
            System.out.println("Eliminar    2");
            System.out.println("Listar      3");
            System.out.println("Salir       4");
            op = sc.nextInt();
            
            switch(op){
                case 1: AgregarFarmaciaDB(); break;
                case 2: EliminarFarmaciaDB(); break;
                case 3: ListarFarmaciaDB(); break;
            }
        }
    }

    private void AgregarFarmaciaDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void EliminarFarmaciaDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void ListarFarmaciaDB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
