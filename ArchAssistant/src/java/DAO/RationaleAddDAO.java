/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Proyecto;
import Modelo.Rationaleadd;

/**
 *
 * @author Prometheus
 */
public interface RationaleAddDAO 
{
    Rationaleadd obtenerRationale(Proyecto pro, String paso);
    
    void guardarRationale(Rationaleadd rata);    
}
