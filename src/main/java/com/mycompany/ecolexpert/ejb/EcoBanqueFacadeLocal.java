/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoBanque;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoBanqueFacadeLocal {

    void create(EcoBanque ecoBanque);

    void edit(EcoBanque ecoBanque);

    void remove(EcoBanque ecoBanque);

    EcoBanque find(Object id);

    List<EcoBanque> findAll();

    List<EcoBanque> findRange(int[] range);

    int count();
    
}
