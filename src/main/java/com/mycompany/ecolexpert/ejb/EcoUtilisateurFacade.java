/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexperte.jpa.EcoUtilisateur;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author TOSHIBA
 */
@Stateless
public class EcoUtilisateurFacade extends AbstractFacade<EcoUtilisateur> implements EcoUtilisateurFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EcoUtilisateurFacade() {
        super(EcoUtilisateur.class);
    }
    
    @Override
    public EcoUtilisateur findByLoginAndPassword(Object vLogin, Object vPass){                   
        Query nQuery = em.createNamedQuery("EcoUtilisateur.findByLoginAndPassword");
        nQuery.setParameter("login", vLogin); 
        nQuery.setParameter("motDePasse", vPass);

        return (EcoUtilisateur) nQuery.getSingleResult(); 
    }
}
