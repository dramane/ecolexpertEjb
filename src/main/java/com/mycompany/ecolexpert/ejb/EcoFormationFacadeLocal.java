/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoFormation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoFormationFacadeLocal {

    void create(EcoFormation ecoFormation);

    void edit(EcoFormation ecoFormation);

    void remove(EcoFormation ecoFormation);

    EcoFormation find(Object id);

    List<EcoFormation> findAll();

    List<EcoFormation> findRange(int[] range);

    int count();
    
}
