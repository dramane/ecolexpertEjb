/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoSpecialiteFormation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HARRISON
 */
@Local
public interface EcoSpecialiteFormationFacadeLocal {

    void create(EcoSpecialiteFormation ecoSpecialiteFormation);

    void edit(EcoSpecialiteFormation ecoSpecialiteFormation);

    void remove(EcoSpecialiteFormation ecoSpecialiteFormation);

    EcoSpecialiteFormation find(Object id);

    List<EcoSpecialiteFormation> findAll();

    List<EcoSpecialiteFormation> findRange(int[] range);

    int count();
    
}
