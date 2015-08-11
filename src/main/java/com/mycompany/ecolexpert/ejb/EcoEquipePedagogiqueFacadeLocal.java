/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoEquipePedagogique;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoEquipePedagogiqueFacadeLocal {

    void create(EcoEquipePedagogique ecoEquipePedagogique);

    void edit(EcoEquipePedagogique ecoEquipePedagogique);

    void remove(EcoEquipePedagogique ecoEquipePedagogique);

    EcoEquipePedagogique find(Object id);

    List<EcoEquipePedagogique> findAll();

    List<EcoEquipePedagogique> findRange(int[] range);

    int count();
    
}
