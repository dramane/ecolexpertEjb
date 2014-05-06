/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoNation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoNationFacadeLocal {

    void create(EcoNation nation);

    void edit(EcoNation nation);

    void remove(EcoNation nation);

    EcoNation find(Object id);

    List<EcoNation> findAll();

    List<EcoNation> findRange(int[] range);

    int count();
    
}
