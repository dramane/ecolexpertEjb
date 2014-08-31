/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoSalle;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoSalleFacadeLocal {

    void create(EcoSalle ecoSalle);

    void edit(EcoSalle ecoSalle);

    void remove(EcoSalle ecoSalle);

    EcoSalle find(Object id);

    List<EcoSalle> findAll();

    List<EcoSalle> findRange(int[] range);

    int count();
    
}
