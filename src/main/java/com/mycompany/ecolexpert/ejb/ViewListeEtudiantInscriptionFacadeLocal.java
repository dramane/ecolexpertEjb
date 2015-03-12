/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecolexpert.ejb;

import com.mycompany.ecolexpert.jpa.ViewEtudiantInscription;
import com.mycompany.ecolexpert.jpa.ViewListeEtudiantInscription;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface ViewListeEtudiantInscriptionFacadeLocal {

    void create(ViewListeEtudiantInscription viewListeEtudiantInscription);

    void edit(ViewListeEtudiantInscription viewListeEtudiantInscription);

    void remove(ViewListeEtudiantInscription viewListeEtudiantInscription);

    ViewListeEtudiantInscription find(Object id);

    List<ViewListeEtudiantInscription> findAll();

    List<ViewListeEtudiantInscription> findRange(int[] range);

    int count();
    
    List<ViewListeEtudiantInscription> findEtudInscripByNomWithJocker(Object vNom); 
    List<ViewListeEtudiantInscription> findEtudInscripByNonEtPrenomWithJocker(Object vNomEtPrenom); 
    List<ViewListeEtudiantInscription> findEtudInscripByAnneeAcaWithJocker(Object vAnneeAca);
    List<ViewListeEtudiantInscription> findEtudInscripByCycleWithJocker(Object vCycle); 
    List<ViewListeEtudiantInscription> findEtudInscripByClasseWithJocker(Object vClasse);   
    List<ViewListeEtudiantInscription> findEtudInscripByAnneCycleClasseWithJocker(String vAnneeAca, String vCycle, String vClasse);
    ViewListeEtudiantInscription findByMatricule(Object vMatricule);
}
