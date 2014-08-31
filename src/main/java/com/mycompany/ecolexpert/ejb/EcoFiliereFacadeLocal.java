/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoFiliere;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoFiliereFacadeLocal {

    void create(EcoFiliere ecoFiliere);

    void edit(EcoFiliere ecoFiliere);

    void remove(EcoFiliere ecoFiliere);

    EcoFiliere find(Object id);

    List<EcoFiliere> findAll();

    List<EcoFiliere> findRange(int[] range);

    int count();
    
}
