/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoParcours;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoParcoursFacadeLocal {

    void create(EcoParcours ecoParcours);

    void edit(EcoParcours ecoParcours);

    void remove(EcoParcours ecoParcours);

    EcoParcours find(Object id);

    List<EcoParcours> findAll();

    List<EcoParcours> findRange(int[] range);

    int count();
    
}
