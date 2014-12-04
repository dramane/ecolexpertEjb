/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoDomaineFormation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoDomaineFormationFacadeLocal {

    void create(EcoDomaineFormation ecoDomaineFormation);

    void edit(EcoDomaineFormation ecoDomaineFormation);

    void remove(EcoDomaineFormation ecoDomaineFormation);

    EcoDomaineFormation find(Object id);

    List<EcoDomaineFormation> findAll();

    List<EcoDomaineFormation> findRange(int[] range);

    int count();
    
}
