/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoCycleEducatif;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Harrison
 */
@Local
public interface EcoCycleEducatifFacadeLocal {

    void create(EcoCycleEducatif ecoCycleEducatif);

    void edit(EcoCycleEducatif ecoCycleEducatif);

    void remove(EcoCycleEducatif ecoCycleEducatif);

    EcoCycleEducatif find(Object id);

    List<EcoCycleEducatif> findAll();

    List<EcoCycleEducatif> findRange(int[] range);

    int count();
    
}
