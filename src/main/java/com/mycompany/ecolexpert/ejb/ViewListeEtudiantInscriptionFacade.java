/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.ViewListeEtudiantInscription;
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
public class ViewListeEtudiantInscriptionFacade extends AbstractFacade<ViewListeEtudiantInscription> implements ViewListeEtudiantInscriptionFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ViewListeEtudiantInscriptionFacade() {
        super(ViewListeEtudiantInscription.class);
    }

    @Override
    public List<ViewListeEtudiantInscription> findEtudInscripByNomWithJocker(Object vNom) {
        String texte = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.nometu LIKE :nometu ORDER BY v.nomEtPrenom ASC";
        Query query = em.createQuery(texte);
        query.setParameter("nometu", vNom+"%"); 
        return query.getResultList();
    }

    @Override
    public List<ViewListeEtudiantInscription> findEtudInscripByNonEtPrenomWithJocker(Object vNomEtPrenom) {
        String texte = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.nomEtPrenom LIKE :nomEtPrenom ORDER BY v.nomEtPrenom ASC";
        Query query = em.createQuery(texte);
        query.setParameter("nomEtPrenom", vNomEtPrenom+"%"); 
        return query.getResultList();
    }

    @Override
    public List<ViewListeEtudiantInscription> findEtudInscripByAnneeAcaWithJocker(Object vAnneeAca) {
        String texte = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.anneeaca LIKE :anneeaca ORDER BY v.nomEtPrenom ASC";
        Query query = em.createQuery(texte);
        query.setParameter("anneeaca", vAnneeAca+"%"); 
        return query.getResultList();
    }

    @Override
    public List<ViewListeEtudiantInscription> findEtudInscripByCycleWithJocker(Object vCycle) {
        String texte = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.codeCycle LIKE :codeCycle ORDER BY v.nomEtPrenom ASC";
        Query query = em.createQuery(texte);
        query.setParameter("codeCycle", vCycle+"%"); 
        return query.getResultList();
    }

    @Override
    public List<ViewListeEtudiantInscription> findEtudInscripByClasseWithJocker(Object vClasse) {
        String texte = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.codeClasse LIKE :codeClasse ORDER BY v.nomEtPrenom ASC";
        Query query = em.createQuery(texte);
        query.setParameter("codeClasse", vClasse+"%"); 
        return query.getResultList();
    }
    
//    @Override
//    public List<ViewListeEtudiantInscription> findEtudInscripByAnneCycleClasseWithJocker(String vAnneeAca, String vCycle, String vClasse) {
//        String texte = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.anneeaca LIKE :anneeaca AND v.codeCycle LIKE :codeCycle AND v.codeClasse LIKE :codeClasse ORDER BY v.nomEtPrenom ASC";
//        Query query = em.createQuery(texte);
//        query.setParameter("anneeaca", vAnneeAca+"%");  
//        query.setParameter("codeCycle", vCycle+"%"); 
//        query.setParameter("codeClasse", vClasse+"%"); 
//        return query.getResultList();
//    }  
    
    @Override
    public List<ViewListeEtudiantInscription> findEtudInscripByAnneCycleClasseWithJocker(String vAnneeAca, String vCycle, String vClasse) {
        String texte = "SELECT v FROM ViewListeEtudiantInscription v WHERE v.anneeaca = :anneeaca AND v.codeCycle = :codeCycle AND v.codeClasse = :codeClasse ORDER BY v.nomEtPrenom ASC";
        Query query = em.createQuery(texte);
        query.setParameter("anneeaca", vAnneeAca);  
        query.setParameter("codeCycle", vCycle); 
        query.setParameter("codeClasse", vClasse); 
        return query.getResultList();
    }

    @Override
    public ViewListeEtudiantInscription findByMatricule(Object vMatricule) {
        Query nQuery = em.createNamedQuery("ViewListeEtudiantInscription.findByMatricule");
        nQuery.setParameter("matricule", vMatricule); 
        return (ViewListeEtudiantInscription) nQuery.getSingleResult();  
    } 
}
