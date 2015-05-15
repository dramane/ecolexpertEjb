/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoLangues;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoLanguesFacadeLocal {

    void create(EcoLangues ecoLangues);

    void edit(EcoLangues ecoLangues);

    void remove(EcoLangues ecoLangues);

    EcoLangues find(Object id);

    List<EcoLangues> findAll();

    List<EcoLangues> findRange(int[] range);

    int count();
    
}
