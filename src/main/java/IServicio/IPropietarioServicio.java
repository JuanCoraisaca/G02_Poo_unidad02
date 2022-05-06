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
    public Propietario crear(Propietario p);
    public Propietario modificar(int c, Propietario p);
    public Propietario eliminar(int c);
    public int buscarPosicion(int c);
    public List<Propietario> listar();
    
}
