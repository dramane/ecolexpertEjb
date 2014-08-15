/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoSystemeAcademique;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoSystemeAcademiqueFacadeLocal {

    void create(EcoSystemeAcademique ecoSystemeAcademique);

    void edit(EcoSystemeAcademique ecoSystemeAcademique);

    void remove(EcoSystemeAcademique ecoSystemeAcademique);

    EcoSystemeAcademique find(Object id);

    List<EcoSystemeAcademique> findAll();

    List<EcoSystemeAcademique> findRange(int[] range);

    int count();
    
}
