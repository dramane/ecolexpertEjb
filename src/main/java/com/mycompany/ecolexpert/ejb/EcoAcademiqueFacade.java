/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoAcademique;
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
public class EcoAcademiqueFacade extends AbstractFacade<EcoAcademique> implements EcoAcademiqueFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EcoAcademiqueFacade() {
        super(EcoAcademique.class);
    }

    @Override
    public EcoAcademique  findAnneeEnCours() {
        String texteRequete = "SELECT e.idacademique, e.anneePre, e.anneeaca, e.dateDebut, e.dateFin FROM EcoAcademique e "+
            "WHERE e.idacademique = (SELECT MAX(a.idacademique) FROM EcoAcademique a)";
        Query nQuery = em.createQuery(texteRequete);
        return  (EcoAcademique) nQuery.getSingleResult(); 
    }
    
}
