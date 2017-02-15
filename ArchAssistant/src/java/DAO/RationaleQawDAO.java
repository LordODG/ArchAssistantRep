/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Proyecto;
import Modelo.Rationaleqaw;

/**
 *
 * @author Prometheus
 */
public interface RationaleQawDAO 
{
    Rationaleqaw obtenerRationale(Proyecto pro, String paso);
    
    void guardarRationale(Rationaleqaw ratq);
}
