/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoSpecialiteFormation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HARRISON
 */
@Stateless
public class EcoSpecialiteFormationFacade extends AbstractFacade<EcoSpecialiteFormation> implements EcoSpecialiteFormationFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EcoSpecialiteFormationFacade() {
        super(EcoSpecialiteFormation.class);
    }
    
}
