/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoCycle;
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
    public List<EcoCycle> findAllDistinct() {
        String texteRequete = "SELECT c.code_cycle , c.designation FROM Eco_Cycle c GROUP BY c.code_cycle";
        Query nQuery = em.createQuery(texteRequete);
        return nQuery.getResultList(); 
    }
    
}
