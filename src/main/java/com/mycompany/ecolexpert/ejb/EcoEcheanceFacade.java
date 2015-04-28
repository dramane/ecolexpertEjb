/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoEcheance;
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
public class EcoEcheanceFacade extends AbstractFacade<EcoEcheance> implements EcoEcheanceFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EcoEcheanceFacade() {
        super(EcoEcheance.class);
    }

    @Override
    public List<EcoEcheance> findByAnneeacaCycleNiveau(Object vAnneeaca, Object vCodeCycle, Object vCodeNiveau) {
        Query nQuery = em.createNamedQuery("EcoEcheance.findByAnneeacaCycleNiveau");
        nQuery.setParameter("anneeaca", vAnneeaca); 
        nQuery.setParameter("codeCycle", vCodeCycle);
        nQuery.setParameter("codeNiveau", vCodeNiveau);

        return nQuery.getResultList(); 
    }
    
}
