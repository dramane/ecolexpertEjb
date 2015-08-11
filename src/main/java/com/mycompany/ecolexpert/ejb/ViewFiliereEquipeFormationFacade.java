/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.ViewFiliereEquipeFormation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author HP
 */
@Stateless
public class ViewFiliereEquipeFormationFacade extends AbstractFacade<ViewFiliereEquipeFormation> implements ViewFiliereEquipeFormationFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ViewFiliereEquipeFormationFacade() {
        super(ViewFiliereEquipeFormation.class);
    }

    @Override
    public ViewFiliereEquipeFormation findByCodeFiliere(Object vCodeFiliere) {
        Query nQuery = em.createNamedQuery("ViewFiliereEquipeFormation.findByCodeFiliere");
        nQuery.setParameter("codeFiliere", vCodeFiliere); 
        return (ViewFiliereEquipeFormation) nQuery.getSingleResult();  
    }
    
}
