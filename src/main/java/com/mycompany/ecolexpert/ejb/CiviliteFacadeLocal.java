/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.Civilite;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface CiviliteFacadeLocal {

    void create(Civilite civilite);

    void edit(Civilite civilite);

    void remove(Civilite civilite);

    Civilite find(Object id);

    List<Civilite> findAll();

    List<Civilite> findRange(int[] range);

    int count();
    
}
