/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.ViewEtudiantInscriptionEcheance;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface ViewEtudiantInscriptionEcheanceFacadeLocal {

    void create(ViewEtudiantInscriptionEcheance viewEtudiantInscriptionEcheance);

    void edit(ViewEtudiantInscriptionEcheance viewEtudiantInscriptionEcheance);

    void remove(ViewEtudiantInscriptionEcheance viewEtudiantInscriptionEcheance);

    ViewEtudiantInscriptionEcheance find(Object id);

    List<ViewEtudiantInscriptionEcheance> findAll();

    List<ViewEtudiantInscriptionEcheance> findRange(int[] range);

    int count();
    
    List<ViewEtudiantInscriptionEcheance> findEtudInscripByNonEtPrenomWithJocker(Object vNomEtPrenom);
    
    ViewEtudiantInscriptionEcheance findByMatricule(Object vMatricule);
}
