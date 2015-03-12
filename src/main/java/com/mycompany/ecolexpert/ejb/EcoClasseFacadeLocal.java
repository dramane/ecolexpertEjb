/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoClasse;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author TOSHIBA
 */
@Local
public interface EcoClasseFacadeLocal {

    void create(EcoClasse ecoClasse);

    void edit(EcoClasse ecoClasse);

    void remove(EcoClasse ecoClasse);

    EcoClasse find(Object id);

    List<EcoClasse> findAll();

    List<EcoClasse> findRange(int[] range);

    int count();
    
    List<EcoClasse> findByCodeCycle(Object vCodeCycle);
    
    List<EcoClasse> findByCodeNiveau(Object vCodeNiveau);
}
