/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IServicio;


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
    public Propietario crear(Propietario propietario) {
        this.propietarioList.add(propietario);
        return propietario;
        }

    @Override
    public Propietario modificar(int codigo, Propietario propietario) {
        this.propietarioList.set(this.buscarPosicion(codigo), propietario);
        return propietario;
        }

    @Override
    public Propietario eliminar(int codigo) {
        var unPropietario=this.propietarioList.get(this.buscarPosicion(codigo));
        this.propietarioList.remove(this.buscarPosicion(codigo));
        return unPropietario;
        }

    @Override
    public List<Propietario> listar() {
        return this.propietarioList;
        }

    @Override
    public int buscarPosicion(int codigo) {
          
        var posicion=-1;
        var i=0;
        for(var auxPropietario:this.propietarioList){
            if(auxPropietario.getCodigo()==codigo){
                posicion=i;
                break;
            }
            i++;
        }
        return posicion;
    }
       }
  

