/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import IServicio.IPropietarioServicio;
import Modelo.Propietario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class PropietarioServicio implements IPropietarioServicio{
    
    private final List<Propietario> propietarioList = new ArrayList<>();

    @Override
    public Propietario crear(Propietario p) {
        this.crear(p);
        return p;
        }

    @Override
    public Propietario modificar(int c, Propietario p) {
        this.propietarioList.set(this.buscarPosicion(c), p);
        return p;
        }

    @Override
    public Propietario eliminar(int c) {
        var barco=this.propietarioList.get(this.buscarPosicion(c));
        this.propietarioList.remove(this.buscarPosicion(c));
        return barco;
        }

    @Override
    public List<Propietario> listar() {
        return this.propietarioList;
        }

    @Override
    public int buscarPosicion(int c) {
          
        var posicion=-1;
        var i=0;
        for(var auxBarco:this.propietarioList){
            if(auxBarco.getCodigo()==c){
                posicion=i;
                break;
            }
            i++;
        }
        return posicion;
    }
       }
  

