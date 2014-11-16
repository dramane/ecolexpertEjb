/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.EcoNiveau;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface EcoNiveauFacadeLocal {

    void create(EcoNiveau ecoNiveau);

    void edit(EcoNiveau ecoNiveau);

    void remove(EcoNiveau ecoNiveau);

    EcoNiveau find(Object id);

    List<EcoNiveau> findAll();

    List<EcoNiveau> findRange(int[] range);

    int count();
    
    List<EcoNiveau> findByCodeCycle(Object vCodeCycle);
    
}
