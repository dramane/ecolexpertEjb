/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoRegime;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoRegimeFacadeLocal {

    void create(EcoRegime ecoRegime);

    void edit(EcoRegime ecoRegime);

    void remove(EcoRegime ecoRegime);

    EcoRegime find(Object id);

    List<EcoRegime> findAll();

    List<EcoRegime> findRange(int[] range);

    int count();
    
}
