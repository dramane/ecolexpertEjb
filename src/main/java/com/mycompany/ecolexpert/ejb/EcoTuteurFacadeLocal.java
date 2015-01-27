/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoTuteur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoTuteurFacadeLocal {

    void create(EcoTuteur ecoTuteur);

    void edit(EcoTuteur ecoTuteur);

    void remove(EcoTuteur ecoTuteur);

    EcoTuteur find(Object id);

    List<EcoTuteur> findAll();

    List<EcoTuteur> findRange(int[] range);

    int count();
    
}
