/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoMyinfo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author HP
 */
@Stateless
public class EcoMyinfoFacade extends AbstractFacade<EcoMyinfo> implements EcoMyinfoFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EcoMyinfoFacade() {
        super(EcoMyinfo.class);
    }

    //selection du derner etablissement enregistré
    @Override
    public EcoMyinfo findMyInfo_etablissementEnCours() {
////        String texteRequete = "SELECT e.idmyinfo, e.codeMyinfo, e.myname, e.mysigle FROM EcoMyinfo e "+
////                "WHERE e.idmyinfo = (SELECT MAX(a.idmyinfo) FROM EcoMyinfo a)";
        String texteRequete = "SELECT e FROM EcoMyinfo e WHERE e.idmyinfo = (SELECT MAX(a.idmyinfo) FROM EcoMyinfo a)";
        Query nQuery = em.createQuery(texteRequete);
        return  (EcoMyinfo) nQuery.getSingleResult(); 
    }
    
}
