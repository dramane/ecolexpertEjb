/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoCivilite;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoCiviliteFacadeLocal {

    void create(EcoCivilite civilite);

    void edit(EcoCivilite civilite);

    void remove(EcoCivilite civilite);

    EcoCivilite find(Object id);

    List<EcoCivilite> findAll();

    List<EcoCivilite> findRange(int[] range);

    int count();
    
}
