/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoElementFrais;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoElementFraisFacadeLocal {

    void create(EcoElementFrais ecoElementFrais);

    void edit(EcoElementFrais ecoElementFrais);

    void remove(EcoElementFrais ecoElementFrais);

    EcoElementFrais find(Object id);

    List<EcoElementFrais> findAll();

    List<EcoElementFrais> findRange(int[] range);

    int count();
    
}
