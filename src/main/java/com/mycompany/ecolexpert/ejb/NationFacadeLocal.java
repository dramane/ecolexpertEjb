/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexperte.jpa.Nation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface NationFacadeLocal {

    void create(Nation nation);

    void edit(Nation nation);

    void remove(Nation nation);

    Nation find(Object id);

    List<Nation> findAll();

    List<Nation> findRange(int[] range);

    int count();
    
}
