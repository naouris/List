/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ACER
 */
public class EspritArrayList implements University<Etudiant>{

      ArrayList<Etudiant> List =new ArrayList<>();
//ArrayList<Etudiant> List;
//public ArrayList<Etudiant>(){
//    LI
//     List=new ArrayList<>();
//    
//}
    @Override
    public void ajouterEtudiant(Etudiant e) {
        List.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
       return  List.contains(e);
          
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
         for(Etudiant e1 :List){
             if (e1.getNom().equals(nom)){
                                  return true;     

             }
         }
      return false;
           
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
         List.remove(e);
        
    }

    @Override
    public void displayEtudiants() {
       for(Etudiant e:List){
           System.out.println(e);
       }
    }

    @Override
    public void trierEtudiantsParId() {
    Collections.sort(List); 

    }

    @Override
    public void trierEtudiantsParNom() {
      
        Collections.sort(List , new IdentiterNom() );
//        for (Etudiant x: List){
//System.out.println(x);}
    }

    @Override
    public String toString() {
        return "EspritArrayList{" + "List=" + List + '}';
    }

  

    
}
