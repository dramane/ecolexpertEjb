/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoMyinfo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoMyinfoFacadeLocal {

    void create(EcoMyinfo ecoMyinfo);

    void edit(EcoMyinfo ecoMyinfo);

    void remove(EcoMyinfo ecoMyinfo);

    EcoMyinfo find(Object id);

    List<EcoMyinfo> findAll();

    List<EcoMyinfo> findRange(int[] range);

    int count();
    
}
