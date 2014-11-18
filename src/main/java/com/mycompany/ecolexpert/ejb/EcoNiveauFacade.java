/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoNiveau;
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
public class EcoNiveauFacade extends AbstractFacade<EcoNiveau> implements EcoNiveauFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EcoNiveauFacade() {
        super(EcoNiveau.class);
    }

    @Override
    public List<EcoNiveau> findByCodeCycle(Object vCodeCycle) {
        Query nQuery = em.createNamedQuery("EcoClasse.findByCodeClasse");
        nQuery.setParameter("codeCycle", vCodeCycle);        
        return nQuery.getResultList(); 
    }
    
}
