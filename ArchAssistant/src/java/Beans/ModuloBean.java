/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;
import DAO.ModuloDAO;
import DAO.ModuloJPADAO;
import Modelo.Modulo;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Prometheus
 */
public class ModuloBean 
{
    @EJB
    private ModuloDAO dao;

    public ModuloBean() 
    {
        /*if (dao != null)
        {*/
            dao = new ModuloJPADAO();
            System.out.println("***Atributo de calidad DAO ha sido creado***");
        //}
    }
    
    public List<Modulo> Listar()
    {
        return dao.ListarModulos();
    }
    
    public void Crear(Modulo atr)
    {
        dao.CrearModulo(atr);
    }
    
    public Modulo Buscar(int id)
    {
        return dao.BuscarModulo(id);
    }
    
    public void Eliminar(Modulo atr)
    {
        dao.EliminarModulo(atr);
    }
    
    public void Modificar(Modulo atr)
    {
        dao.ModificarModulo(atr);
    }
    
}
