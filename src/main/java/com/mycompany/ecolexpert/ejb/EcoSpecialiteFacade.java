/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoSpecialite;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author HP
 */
@Stateless
public class EcoSpecialiteFacade extends AbstractFacade<EcoSpecialite> implements EcoSpecialiteFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EcoSpecialiteFacade() {
        super(EcoSpecialite.class);
    }

    @Override
    public List<EcoSpecialite> findByCodeFiliere(String vCodeFiliere) {
        Query nQuery = em.createNamedQuery("EcoSpecialite.findByCodeFiliere");
        nQuery.setParameter("codeFiliere", vCodeFiliere);        
        return nQuery.getResultList(); 
    }
    
}
