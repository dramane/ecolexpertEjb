/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoClasse;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author TOSHIBA
 */
@Stateless
public class EcoClasseFacade extends AbstractFacade<EcoClasse> implements EcoClasseFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EcoClasseFacade() {
        super(EcoClasse.class);
    }

    @Override
    public List<EcoClasse> findByCodeNiveau(Object vCodeNiveau) {
        Query nQuery = em.createNamedQuery("EcoNiveau.findByCodeNiveau");
        nQuery.setParameter("codeNiveau", vCodeNiveau);        
        return nQuery.getResultList(); 
    }
    
}
