/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoNumetu;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author HP
 */
@Stateless
public class EcoNumetuFacade extends AbstractFacade<EcoNumetu> implements EcoNumetuFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EcoNumetuFacade() {
        super(EcoNumetu.class);
    }

    @Override
    public EcoNumetu findMaxNumEtudiant() {
//        String texte = "SELECT MAX(e.idnumetu) AS MaxNumEtudiant FROM EcoNumetu e";
        String texte = "SELECT e.idnumetu FROM EcoNumetu e WHERE e.idnumetu >= ALL ( SELECT c.idnumetu FROM EcoNumetu c ORDER BY c.idnumetu DESC)";
        Query query =  em.createQuery(texte);
        return (EcoNumetu) query.getSingleResult();
    }
    
}
