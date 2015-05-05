/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.ViewEtudiantInscription;
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
public class ViewEtudiantInscriptionFacade extends AbstractFacade<ViewEtudiantInscription> implements ViewEtudiantInscriptionFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ViewEtudiantInscriptionFacade() {
        super(ViewEtudiantInscription.class);
    }

    @Override
    public List<ViewEtudiantInscription> findEtudInscripByNomWithJocker(Object vNom) {
        String texte = "SELECT v FROM ViewEtudiantInscription v WHERE v.nometu LIKE :nometu ORDER BY v.nomEtPrenom";
        Query query = em.createQuery(texte);
        query.setParameter("nometu", vNom+"%"); 
        return query.getResultList();
    }

    @Override
    public ViewEtudiantInscription findByMatricule(Object vMatricule) {
        Query nQuery = em.createNamedQuery("ViewEtudiantInscription.findByMatricule");
        nQuery.setParameter("matricule", vMatricule); 
        return (ViewEtudiantInscription) nQuery.getSingleResult();    
    }

    @Override
    public List<ViewEtudiantInscription> findEtudInscripByNomEtPrenomWithJocker(Object vNomEtPrenom) {
        String texte = "SELECT v FROM ViewEtudiantInscription v WHERE v.nomEtPrenom LIKE :nomEtPrenom ORDER BY v.nomEtPrenom";
        Query query = em.createQuery(texte);
        query.setParameter("nomEtPrenom", vNomEtPrenom+"%"); 
        return query.getResultList();
    }
    
}
