/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import IServicio.IAutoServicio;
import Modelo.Auto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class AutoServicio implements IAutoServicio{
    
    private final List<Auto> autoList = new ArrayList<>();

    @Override
    public Auto crear(Auto a) {
        this.autoList.add(a);
        return a;
        }

    @Override
    public Auto modificar(int c, Auto a) {
        this.autoList.set(this.buscarPosicion(c),a);
        return a;
        }

    @Override
    public Auto eliminar(int c) {
        var auto=this.autoList.get(this.buscarPosicion(c));
        this.autoList.remove(this.eliminar(c));
        return auto;
        }

    @Override
    public List<Auto> listar() {
        return this.autoList;
        }

    @Override
    public int buscarPosicion(int c) {
        var posicion=-1;
        var i=0;
        for(var auxAuto:this.autoList){
            if(auxAuto.getCodigo()==c){
                posicion=i;
                break;
            }
            i++;
        }
        return posicion;
    }
    }
    

