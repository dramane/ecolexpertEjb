/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoNumetud;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author HP
 */
@Stateless
public class EcoNumetudFacade extends AbstractFacade<EcoNumetud> implements EcoNumetudFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EcoNumetudFacade() {
        super(EcoNumetud.class);
    }

    @Override
    public EcoNumetud findMaxNumEtudiant() {
//        String texte = "SELECT MAX(e.idnumetu) AS MaxNumEtudiant FROM EcoNumetud e";
        String texte = "SELECT e.idnumetu FROM EcoNumetud e WHERE e.idnumetu >= ALL ( SELECT c.idnumetu FROM EcoNumetud c ORDER BY c.idnumetu DESC)";
        Query query =  em.createQuery(texte);
        return (EcoNumetud) query.getSingleResult();
    }
    
}
