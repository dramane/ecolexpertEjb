/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoSemetre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoSemetreFacadeLocal {

    void create(EcoSemetre ecoSemetre);

    void edit(EcoSemetre ecoSemetre);

    void remove(EcoSemetre ecoSemetre);

    EcoSemetre find(Object id);

    List<EcoSemetre> findAll();

    List<EcoSemetre> findRange(int[] range);

    int count();
    
}
