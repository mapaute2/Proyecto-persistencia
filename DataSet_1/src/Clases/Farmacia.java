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
public class Farmacia {
    
    private int id;
    private String nombre;
    private int num_medicamentos;
    private String ciudad;
    private Distribuidor dis;

    public Farmacia() {
    }

    public Farmacia(int id, String nombre, int num_medicamentos, String ciudad, Distribuidor dis) {
        this.id = id;
        this.nombre = nombre;
        this.num_medicamentos = num_medicamentos;
        this.ciudad = ciudad;
        this.dis = dis;
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

    public int getNum_medicamentos() {
        return num_medicamentos;
    }

    public void setNum_medicamentos(int num_medicamentos) {
        this.num_medicamentos = num_medicamentos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Distribuidor getDis() {
        return dis;
    }

    public void setDis(Distribuidor dis) {
        this.dis = dis;
    }

    @Override
    public String toString() {
        return "Farmacia{" + "id=" + id + ", nombre=" + nombre + ", num_medicamentos=" + num_medicamentos + ", ciudad=" + ciudad + ", dis=" + dis + '}';
    }

    
}
