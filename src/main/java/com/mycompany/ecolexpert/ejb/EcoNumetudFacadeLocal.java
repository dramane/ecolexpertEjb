/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoNumetud;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoNumetudFacadeLocal {

    void create(EcoNumetud ecoNumetud);

    void edit(EcoNumetud ecoNumetud);

    void remove(EcoNumetud ecoNumetud);

    EcoNumetud find(Object id);

    List<EcoNumetud> findAll();

    List<EcoNumetud> findRange(int[] range);

    int count();
    
    EcoNumetud findMaxNumEtudiant();
}
