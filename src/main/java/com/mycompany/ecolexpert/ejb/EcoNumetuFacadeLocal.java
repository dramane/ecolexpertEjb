/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoNumetu;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoNumetuFacadeLocal {

    void create(EcoNumetu ecoNumetu);

    void edit(EcoNumetu ecoNumetu);

    void remove(EcoNumetu ecoNumetu);

    EcoNumetu find(Object id);

    List<EcoNumetu> findAll();

    List<EcoNumetu> findRange(int[] range);

    int count();
    
    EcoNumetu findMaxNumEtudiant();
    
}
