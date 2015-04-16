/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoEcheance;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoEcheanceFacadeLocal {

    void create(EcoEcheance ecoEcheance);

    void edit(EcoEcheance ecoEcheance);

    void remove(EcoEcheance ecoEcheance);

    EcoEcheance find(Object id);

    List<EcoEcheance> findAll();

    List<EcoEcheance> findRange(int[] range);

    int count();
    
}
