/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoRegime;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author TOSHIBA
 */
@Stateless
public class EcoRegimeFacade extends AbstractFacade<EcoRegime> implements EcoRegimeFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_ecolexpertEjb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EcoRegimeFacade() {
        super(EcoRegime.class);
    }
    
}
