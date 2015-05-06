/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.ViewEtudiantInscriptionEcheance;
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
public class ViewEtudiantInscriptionEcheanceFacade extends AbstractFacade<ViewEtudiantInscriptionEcheance> implements ViewEtudiantInscriptionEcheanceFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ViewEtudiantInscriptionEcheanceFacade() {
        super(ViewEtudiantInscriptionEcheance.class);
    }

    @Override
    public List<ViewEtudiantInscriptionEcheance> findEtudInscripByNonEtPrenomWithJocker(Object vNomEtPrenom) {
        String texte = "SELECT v FROM ViewEtudiantInscriptionEcheance v WHERE v.nomEtPrenom LIKE :nomEtPrenom ORDER BY v.nomEtPrenom ASC";
        Query query = em.createQuery(texte);
        query.setParameter("nomEtPrenom", vNomEtPrenom+"%"); 
        return query.getResultList();
    }

    @Override
    public ViewEtudiantInscriptionEcheance findByMatricule(Object vMatricule) {
        Query nQuery = em.createNamedQuery("ViewEtudiantInscriptionEcheance.findByMatricule");
        nQuery.setParameter("matricule", vMatricule); 
        return (ViewEtudiantInscriptionEcheance) nQuery.getSingleResult();  
    
    }
    
}
