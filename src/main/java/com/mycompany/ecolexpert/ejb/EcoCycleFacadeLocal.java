/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoCycle;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoCycleFacadeLocal {

    void create(EcoCycle ecoCycle);

    void edit(EcoCycle ecoCycle);

    void remove(EcoCycle ecoCycle);

    EcoCycle find(Object id);

    List<EcoCycle> findAll();

    List<EcoCycle> findRange(int[] range);

    int count();
    
    List<EcoCycle> findAllDistinct();
    
}
