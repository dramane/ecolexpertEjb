/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoMatrimoniale;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoMatrimonialeFacadeLocal {

    void create(EcoMatrimoniale ecoMatrimoniale);

    void edit(EcoMatrimoniale ecoMatrimoniale);

    void remove(EcoMatrimoniale ecoMatrimoniale);

    EcoMatrimoniale find(Object id);

    List<EcoMatrimoniale> findAll();

    List<EcoMatrimoniale> findRange(int[] range);

    int count();
    
}
