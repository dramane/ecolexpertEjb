/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoFraisScolarite;
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
public class EcoFraisScolariteFacade extends AbstractFacade<EcoFraisScolarite> implements EcoFraisScolariteFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EcoFraisScolariteFacade() {
        super(EcoFraisScolarite.class);
    }

    @Override
    public List<EcoFraisScolarite> findByCodeCycleCodeRegime(Object vCodeMyinfo, Object vIdacademique, Object vCodeCycle, Object vCodeNiveau, Object vCodeRegime) {
        Query nQuery = em.createNamedQuery("EcoFraisScolarite.findByCodeCycleCodeRegime");
        nQuery.setParameter("codeMyinfo", vCodeMyinfo); 
        nQuery.setParameter("idacademique", vIdacademique);
        nQuery.setParameter("codeCycle", vCodeCycle); 
        nQuery.setParameter("codeNiveau", vCodeNiveau);
        nQuery.setParameter("codeRegime", vCodeRegime); 

        return  nQuery.getResultList(); 
    }
    
}
