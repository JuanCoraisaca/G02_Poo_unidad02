/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IServicio;

import Modelo.Propietario;
import java.util.List;

/**
 *
 * @author usuario
 */
public interface IPropietarioServicio {
    public Propietario crear(Propietario propietario);
    public Propietario modificar(int codigo, Propietario propietario);
    public Propietario eliminar(int codigo);
    public int buscarPosicion(int codigo);
    public List<Propietario> listar();
    
}
