/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoEtudiant;
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
public class EcoEtudiantFacade extends AbstractFacade<EcoEtudiant> implements EcoEtudiantFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EcoEtudiantFacade() {
        super(EcoEtudiant.class);
    }

    @Override
    public List<EcoEtudiant> findByNometuWithJocker(Object vNom) {
        String texte = "SELECT e FROM EcoEtudiant e WHERE e.nometu LIKE :nometu";
        Query query = em.createQuery(texte);
        query.setParameter("nometu", vNom+"%"); 
        return query.getResultList();
    }
}
