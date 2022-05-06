/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author usuario
 */

public class Propietario {
    private String nombre;
    private int cedula;
    private int telefono;
    private String direccion;
    private int codigo;

    public Propietario(String nombre, int cedula, int telefono, String direccion, int codigo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigo = codigo;
    }

    
    
    public boolean esCelular()
    {
        return true;
            
    }
    
    public boolean esTelefonoValido()
    {
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", cedula=" + cedula + 
                ", telefono=" + telefono + ", direccion=" + direccion + 
                "\n"+", codigo=" + codigo + '}';
    }

    
}
