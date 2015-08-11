/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoTypeUe;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoTypeUeFacadeLocal {

    void create(EcoTypeUe ecoTypeUe);

    void edit(EcoTypeUe ecoTypeUe);

    void remove(EcoTypeUe ecoTypeUe);

    EcoTypeUe find(Object id);

    List<EcoTypeUe> findAll();

    List<EcoTypeUe> findRange(int[] range);

    int count();
    
}
