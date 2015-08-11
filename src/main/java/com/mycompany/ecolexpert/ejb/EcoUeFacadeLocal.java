/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoUe;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoUeFacadeLocal {

    void create(EcoUe ecoUe);

    void edit(EcoUe ecoUe);

    void remove(EcoUe ecoUe);

    EcoUe find(Object id);

    List<EcoUe> findAll();

    List<EcoUe> findRange(int[] range);

    int count();
    
}
