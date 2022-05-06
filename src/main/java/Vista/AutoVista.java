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
        autoControlador.crear(2010, "ADF 674", 01, "Negro", "Juan", 016674, 2889, "Miraflores", 001);
        autoControlador.crear(2015, "GAP 543", 02, "Blanco", "Pedro", 016675, 4060, "Larga", 002);
        
        
        var auto1 = new Auto(2010,"ADF 674", 01, "Negro");
        var auto2 = new Auto(2015, "GAP 543", 02, "Blanco");
        
        System.out.println("La edad del auto es: " + auto1.calcularYears(2022));
        System.out.println("El auto es taxi? " + auto1.esTaxi());
        
        System.out.println(".........................");
        
        System.out.println("La edad del auto es: " + auto2.calcularYears(2022));
        System.out.println("El auto es taxi? " + auto2.esTaxi());

        System.out.println("Lista de Autos........");
        for (Auto auto : autoControlador.listar()) {
            System.out.println(auto.toString());

        }
        System.out.println("-------------------------------------------------");

        autoControlador.eliminar(001);
        System.out.println("Lista Eliminar");
        for (Auto auto : autoControlador.listar()) {
            System.out.println(auto.toString());
          
        }
    }
}
