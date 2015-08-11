/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoTypeParcours;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoTypeParcoursFacadeLocal {

    void create(EcoTypeParcours ecoTypeParcours);

    void edit(EcoTypeParcours ecoTypeParcours);

    void remove(EcoTypeParcours ecoTypeParcours);

    EcoTypeParcours find(Object id);

    List<EcoTypeParcours> findAll();

    List<EcoTypeParcours> findRange(int[] range);

    int count();
    
}
