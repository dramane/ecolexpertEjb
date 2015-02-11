/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoVersement;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoVersementFacadeLocal {

    void create(EcoVersement ecoVersement);

    void edit(EcoVersement ecoVersement);

    void remove(EcoVersement ecoVersement);

    EcoVersement find(Object id);

    List<EcoVersement> findAll();

    List<EcoVersement> findRange(int[] range);

    int count();
    
}
