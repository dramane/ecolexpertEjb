/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoBatiment;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoBatimentFacadeLocal {

    void create(EcoBatiment ecoBatiment);

    void edit(EcoBatiment ecoBatiment);

    void remove(EcoBatiment ecoBatiment);

    EcoBatiment find(Object id);

    List<EcoBatiment> findAll();

    List<EcoBatiment> findRange(int[] range);

    int count();
    
}
