/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.AutoControlador;
import Modelo.Auto;

/**
 *
 * @author usuario
 */
public class AutoVista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        var autoControlador = new AutoControlador();
        autoControlador.crear(2017, "AHD 0972", 1234, "Negro", "Juan", 0106675427, 286675, "Miraflores", 123);
        autoControlador.crear(2017, "AHD 0972", 1234, "Negro", "Juan", 0106675427, 286675, "Miraflores", 123);
        autoControlador.crear(2017, "AHD 0972", 1234, "Negro", "Juan", 0106675427, 286675, "Miraflores", 123);
        autoControlador.crear(2017, "AHD 0972", 1234, "Negro", "Juan", 0106675427, 286675, "Miraflores", 123);
        
        System.out.println("Listado Inicial");
        
        for(Auto a: autoControlador.listar())
            System.out.println(a.toString());
        
        autoControlador.eliminar(2015);

        System.out.println("Listado Eliminando el año 2015");
        
        for(Auto a: autoControlador.listar())
            System.out.println(a.toString());

        System.out.println("Listado Modificando el año 2019");
        
         
       
        
       
       }
   
  }
    

