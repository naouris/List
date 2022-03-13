/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
                Etudiant e1=new Etudiant(5555, "nawres", "oueslati");
                 Etudiant e2=new Etudiant(5584, "emna", "melk");
                  Etudiant e3=new Etudiant(5584, "farah","abedelli");
                 EspritVector v=new EspritVector();
                  v.ajouterEtudiant(e1);
                  v.ajouterEtudiant(e2);
                  v.ajouterEtudiant(e3);
       v.displayEtudiants();

                  System.out.println(v.rechercherEtudiant(e3));
                  System.out.println(v.rechercherEtudiant("emna"));
                    v.supprimerEtudiant(e2);
                  
                    v.displayEtudiants();
              System.out.println("********************");    
                    v.trierEtudiantsParId();  
                    v.displayEtudiants();

              System.out.println("********************");      

                   v.trierEtudiantsParNom();
                   v.displayEtudiants();  
                   
       System.out.println("--------------------------------------------------------------------------");      

              EspritArrayList E=new EspritArrayList();
                  E.ajouterEtudiant(e1);
                  E.ajouterEtudiant(e2);
                  E.ajouterEtudiant(e3);
  
                 
                  System.out.println(E.rechercherEtudiant(e3));
                  
                  System.out.println(E.rechercherEtudiant("emna"));
                  
                  E.supprimerEtudiant(e2);
                  
                  E.displayEtudiants();
              
                System.out.println("********************");      

                E.trierEtudiantsParId();  
                    E.displayEtudiants();

              System.out.println("********************");      

        E.trierEtudiantsParNom();
                   E.displayEtudiants();



    }
    
}
