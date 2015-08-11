/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoProfilParcours;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoProfilParcoursFacadeLocal {

    void create(EcoProfilParcours ecoProfilParcours);

    void edit(EcoProfilParcours ecoProfilParcours);

    void remove(EcoProfilParcours ecoProfilParcours);

    EcoProfilParcours find(Object id);

    List<EcoProfilParcours> findAll();

    List<EcoProfilParcours> findRange(int[] range);

    int count();
    
}
