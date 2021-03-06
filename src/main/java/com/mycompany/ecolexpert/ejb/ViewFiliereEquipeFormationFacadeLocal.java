/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.ViewFiliereEquipeFormation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface ViewFiliereEquipeFormationFacadeLocal {

    void create(ViewFiliereEquipeFormation viewFiliereEquipeFormation);

    void edit(ViewFiliereEquipeFormation viewFiliereEquipeFormation);

    void remove(ViewFiliereEquipeFormation viewFiliereEquipeFormation);

    ViewFiliereEquipeFormation find(Object id);

    List<ViewFiliereEquipeFormation> findAll();

    List<ViewFiliereEquipeFormation> findRange(int[] range);

    int count();
    
    ViewFiliereEquipeFormation findByCodeFiliere(Object vCodeFiliere);
}
