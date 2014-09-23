/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoAcademique;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoAcademiqueFacadeLocal {

    void create(EcoAcademique academique);

    void edit(EcoAcademique academique);

    void remove(EcoAcademique academique);

    EcoAcademique find(Object id);

    List<EcoAcademique> findAll();

    List<EcoAcademique> findRange(int[] range);

    int count();
    
    EcoAcademique findAnneeEnCours();
    
}
