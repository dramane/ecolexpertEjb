/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoEcue;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoEcueFacadeLocal {

    void create(EcoEcue ecoEcue);

    void edit(EcoEcue ecoEcue);

    void remove(EcoEcue ecoEcue);

    EcoEcue find(Object id);

    List<EcoEcue> findAll();

    List<EcoEcue> findRange(int[] range);

    int count();
    
}
