/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoCycle;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author TOSHIBA
 */
@Stateless
public class EcoCycleFacade extends AbstractFacade<EcoCycle> implements EcoCycleFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EcoCycleFacade() {
        super(EcoCycle.class);
    }
    
    @Override
    public EcoCycle findAllDistinct(Object vCodecycle, Object vCode3){                   
        Query nQuery = em.createNamedQuery("EcoUtilisateur.findByLoginAndPassword");
        return (EcoCycle) nQuery.getResultList(); 
    }
    
}
