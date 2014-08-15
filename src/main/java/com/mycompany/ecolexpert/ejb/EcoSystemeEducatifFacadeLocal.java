/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoSystemeEducatif;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoSystemeEducatifFacadeLocal {

    void create(EcoSystemeEducatif ecoSystemeEducatif);

    void edit(EcoSystemeEducatif ecoSystemeEducatif);

    void remove(EcoSystemeEducatif ecoSystemeEducatif);

    EcoSystemeEducatif find(Object id);

    List<EcoSystemeEducatif> findAll();

    List<EcoSystemeEducatif> findRange(int[] range);

    int count();
    
}
