/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoFraisScolarite;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoFraisScolariteFacadeLocal {

    void create(EcoFraisScolarite ecoFraisScolarite);

    void edit(EcoFraisScolarite ecoFraisScolarite);

    void remove(EcoFraisScolarite ecoFraisScolarite);

    EcoFraisScolarite find(Object id);

    List<EcoFraisScolarite> findAll();

    List<EcoFraisScolarite> findRange(int[] range);

    int count();
    
    List<EcoFraisScolarite> findByCodeCycleCodeRegime(Object vCodeMyinfo, Object vIdacademique, Object vCodeCycle, Object vCodeNiveau, Object vCodeRegime);
}
