/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IServicio;

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
    public Auto crear(Auto auto) {
        this.autoList.add(auto);
        return auto;
        }

    @Override
    public Auto modificar(int codigo, Auto auto) {
        this.autoList.set(this.buscarPosicion(codigo),auto);
        return auto;
        }

    @Override
    public Auto eliminar(int codigo) {
        var auto=this.autoList.get(this.buscarPosicion(codigo));
        this.autoList.remove(this.buscarPosicion(codigo));
        return auto;
        }

    
    @Override
    public List<Auto> listar() {
        return this.autoList;
        }

    @Override
    public int buscarPosicion(int codigo) {
        var posicion=-1;
        var i=0;
        for(var auxAuto:this.autoList){
            if(auxAuto.getCodigo()==codigo){
                posicion=i;
                break;
            }
            i++;
        }
        return posicion;
    }
    }
    

