/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoSpecialite;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoSpecialiteFacadeLocal {

    void create(EcoSpecialite ecoSpecialite);

    void edit(EcoSpecialite ecoSpecialite);

    void remove(EcoSpecialite ecoSpecialite);

    EcoSpecialite find(Object id);

    List<EcoSpecialite> findAll();

    List<EcoSpecialite> findRange(int[] range);

    int count();
    
}
