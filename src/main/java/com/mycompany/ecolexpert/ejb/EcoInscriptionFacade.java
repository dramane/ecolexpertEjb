/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoInscription;
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
public class EcoInscriptionFacade extends AbstractFacade<EcoInscription> implements EcoInscriptionFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EcoInscriptionFacade() {
        super(EcoInscription.class);
    }

    @Override
    public EcoInscription findByMatricule(Object vMatricule) {
        Query nQuery = em.createNamedQuery("EcoInscription.findByMatricule");
        nQuery.setParameter("matricule", vMatricule); 
        return (EcoInscription) nQuery.getSingleResult();   
    }

    @Override
    public EcoInscription findByNumetu(Object vNumetu) {
        Query nQuery = em.createNamedQuery("EcoInscription.findByNumetu");
        nQuery.setParameter("numetu", vNumetu); 
        return (EcoInscription) nQuery.getSingleResult(); 
    }
    
}
