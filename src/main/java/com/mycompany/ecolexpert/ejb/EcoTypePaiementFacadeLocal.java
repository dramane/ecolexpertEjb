/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoTypePaiement;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoTypePaiementFacadeLocal {

    void create(EcoTypePaiement ecoTypePaiement);

    void edit(EcoTypePaiement ecoTypePaiement);

    void remove(EcoTypePaiement ecoTypePaiement);

    EcoTypePaiement find(Object id);

    List<EcoTypePaiement> findAll();

    List<EcoTypePaiement> findRange(int[] range);

    int count();
    
}
