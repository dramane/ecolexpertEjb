/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexperte.jpa.DomaineFormation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface DomaineFormationFacadeLocal {

    void create(DomaineFormation domaineFormation);

    void edit(DomaineFormation domaineFormation);

    void remove(DomaineFormation domaineFormation);

    DomaineFormation find(Object id);

    List<DomaineFormation> findAll();

    List<DomaineFormation> findRange(int[] range);

    int count();
    
}
