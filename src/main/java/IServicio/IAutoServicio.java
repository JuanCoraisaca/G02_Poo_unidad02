/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IServicio;

import Modelo.Auto;
import java.util.List;

/**
 *
 * @author usuario
 */

public interface IAutoServicio {
    public Auto crear(Auto auto);
    public Auto modificar(int codigo, Auto auto);
    public Auto eliminar(int codigo);
    public int buscarPosicion(int codigo);
    public List<Auto> listar();
}
