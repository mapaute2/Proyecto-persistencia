/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Alejandra Paute
 * @fecha 21/06/2022
 */
public class Distribuidor {
    
    private int id;
    private String nombre;
    private String direccion;
    private String numero;

    public Distribuidor() {
    }

    public Distribuidor(int id, String nombre, String direccion, String numero) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Distribuidor{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", numero=" + numero + '}';
    }
}
