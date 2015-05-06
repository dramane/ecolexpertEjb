/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoEcheanceEtudiant;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author HP
 */
@Stateless
public class EcoEcheanceEtudiantFacade extends AbstractFacade<EcoEcheanceEtudiant> implements EcoEcheanceEtudiantFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EcoEcheanceEtudiantFacade() {
        super(EcoEcheanceEtudiant.class);
    }

    @Override
    public EcoEcheanceEtudiant findByMatricule(Object vMatricule) {
        Query nQuery = em.createNamedQuery("EcoEcheanceEtudiant.findByMatricule");
        nQuery.setParameter("matricule", vMatricule); 

        return (EcoEcheanceEtudiant) nQuery.getSingleResult(); 
    }
    
}
