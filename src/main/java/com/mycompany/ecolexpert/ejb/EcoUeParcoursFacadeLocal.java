/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoUeParcours;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoUeParcoursFacadeLocal {

    void create(EcoUeParcours ecoUeParcours);

    void edit(EcoUeParcours ecoUeParcours);

    void remove(EcoUeParcours ecoUeParcours);

    EcoUeParcours find(Object id);

    List<EcoUeParcours> findAll();

    List<EcoUeParcours> findRange(int[] range);

    int count();
    
}
