/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoRubriques;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoRubriquesFacadeLocal {

    void create(EcoRubriques ecoRubriques);

    void edit(EcoRubriques ecoRubriques);

    void remove(EcoRubriques ecoRubriques);

    EcoRubriques find(Object id);

    List<EcoRubriques> findAll();

    List<EcoRubriques> findRange(int[] range);

    int count();
    
}
