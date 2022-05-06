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
    public Auto crear(Auto a);
    public Auto modificar(int c, Auto a);
    public Auto eliminar(int c);
    public int buscarPosicion(int c);
    public List<Auto> listar();
}
