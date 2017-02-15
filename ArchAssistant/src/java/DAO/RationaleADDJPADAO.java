/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Proyecto;
import Modelo.Rationaleadd;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Prometheus
 */
public class RationaleADDJPADAO implements RationaleAddDAO
{

     EntityManager em;
    EntityManagerFactory emf;

    public RationaleADDJPADAO() 
    {
        emf = Persistence.createEntityManagerFactory("ArchAssistantPU");
        em = emf.createEntityManager();
    
    }
    
    
    
    @Override
    public Rationaleadd obtenerRationale(Proyecto pro, String paso) {
        List<Rationaleadd> ratios = pro.getRationaleaddList();
        if (ratios != null)
        {
            for (Rationaleadd r : ratios)
            {
                if (r.getRatAddPaso().equals(paso))
                    return r;
            }
        }
        return null;
    }

    @Override
    public void guardarRationale(Rationaleadd rata) {
      
        em.getTransaction().begin();
        if (rata.getRatAddID() != null)
        {
            em.merge(rata);
        }
        else
        {
            em.persist(rata);
        }
        em.getTransaction().commit();
    }
    
}
