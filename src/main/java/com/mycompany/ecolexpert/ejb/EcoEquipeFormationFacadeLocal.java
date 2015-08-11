/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoEquipeFormation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoEquipeFormationFacadeLocal {

    void create(EcoEquipeFormation ecoEquipeFormation);

    void edit(EcoEquipeFormation ecoEquipeFormation);

    void remove(EcoEquipeFormation ecoEquipeFormation);

    EcoEquipeFormation find(Object id);

    List<EcoEquipeFormation> findAll();

    List<EcoEquipeFormation> findRange(int[] range);

    int count();
    
}
