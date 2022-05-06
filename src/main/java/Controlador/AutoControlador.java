/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Auto;
import Modelo.Propietario;
import Servicio.AutoServicio;
import java.util.List;

/**
 *
 * @author usuario
 */
public class AutoControlador {
    
    private AutoServicio autoServicio = new AutoServicio();
    
    public Auto crear(int y,String p,int c,String cl,
        String n,int ce,int tl,String d,int co){
        var propietario = new Propietario(n,ce,tl,d,co);
        var auto = new Auto(y,p,c,cl);
        this.autoServicio.crear(auto);
        return auto;
        
        
    }
    
    public Auto eliminar(int c) {
        return this.autoServicio.eliminar(c);
    }
    
    public Auto modificar(int c, Auto a) {
        return this.autoServicio.modificar(c,a);
    }
    
    
    
    public List<Auto> listar()
    {
        return this.autoServicio.listar();
    }
}
