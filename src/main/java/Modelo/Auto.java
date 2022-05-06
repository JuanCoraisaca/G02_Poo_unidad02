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
public class Auto {

    private int year;
    private String placa;
    private int codigo;
    private String color;
    private Propietario unPropietario;

    public Auto(int year, String placa, int codigo, String color) {
        this.year = year;
        this.placa = placa;
        this.codigo = codigo;
        this.color = color;
    }

    

    
    public int calcularYears(int currentYear){
        var retorno=1000;
        retorno=currentYear-this.year;
        return retorno;
    }
    private boolean sePuedeAsegurar(int currentYear, int edadMaxima){
        return this.calcularYears(currentYear)<=edadMaxima;
    }

    
   
    public boolean esTaxi(){
        var retorno = false;
        
        if(this.color=="amarillo"){
            retorno=true;
        }
        
        return retorno;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Propietario getUnPropietario() {
        return unPropietario;
    }

    public void setUnPropietario(Propietario unPropietario) {
        this.unPropietario = unPropietario;
    }

    @Override
    public String toString() {
        return "Auto{" + "year=" + year + ", placa=" + placa 
                + ", codigo=" + codigo 
                + ", color=" + color 
                + "\n"+", unPropietario=" + unPropietario + '}';
    }

    
}
