/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexperte.jpa.EcoProfilUtilisateur;
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
public class EcoProfilUtilisateurFacade extends AbstractFacade<EcoProfilUtilisateur> implements EcoProfilUtilisateurFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EcoProfilUtilisateurFacade() {
        super(EcoProfilUtilisateur.class);
    }
    
    @Override
    public List<EcoProfilUtilisateur> findByIdUtilisateurAndActive (Object vIdUtilisateur, int vActive){                   
        Query nQuery = em.createNamedQuery("EcoProfilUtilisateur.findByIdUtilisateurAndActive");
        nQuery.setParameter("idUtilisateur", vIdUtilisateur); 
        nQuery.setParameter("active", vActive);

        return nQuery.getResultList(); 
    }
}
