/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Auto;
import Modelo.Propietario;
import IServicio.AutoServicio;
import java.util.List;

/**
 *
 * @author usuario
 */
public class AutoControlador {
    
    
    
    private AutoServicio autoServicio = new AutoServicio();
    
    public Auto crear(int year,String placa,int codigo,String color,
        String nombre,int cedula,int telefono,String direccion,int codigo1){
        var unPropietario = new Propietario(nombre,cedula,telefono,direccion,codigo1);
        var auto = new Auto(year,placa,codigo,color);
        this.autoServicio.crear(auto);
        return auto;
        
        
    }
    
    public Auto eliminar(int codigo) {
        return this.autoServicio.eliminar(codigo);
    }
    
    public Auto modificar(int codigo, Auto auto) {
        return this.autoServicio.modificar(codigo,auto);
    }
    
    
    
    public List<Auto> listar()
    {
        return this.autoServicio.listar();
    }
}
