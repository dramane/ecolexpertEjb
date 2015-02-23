/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.ViewEtudiantInscription;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface ViewEtudiantInscriptionFacadeLocal {

    void create(ViewEtudiantInscription viewEtudiantInscription);

    void edit(ViewEtudiantInscription viewEtudiantInscription);

    void remove(ViewEtudiantInscription viewEtudiantInscription);

    ViewEtudiantInscription find(Object id);

    List<ViewEtudiantInscription> findAll();

    List<ViewEtudiantInscription> findRange(int[] range);

    int count();
    
    List<ViewEtudiantInscription> findEtudInscripByNomWithJocker(Object vNom);      
}
