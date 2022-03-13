/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.Collections;
import java.util.Vector;

/**
 *
 * @author ACER
 */
public class EspritVector implements University<Etudiant>{
            Vector<Etudiant> List2 =new  Vector<>();

    @Override
    public void ajouterEtudiant(Etudiant e) {
List2.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
       return  List2.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
for(Etudiant e:List2){
    if (e.getNom().equals(nom)){
                                  return true;     
 
}}
return false;
        }

    @Override
    public void supprimerEtudiant(Etudiant e) {
List2.remove(e);    }

    @Override
    public void displayEtudiants() {
  for(Etudiant e:List2){
           System.out.println(e);
       }  
    }

    @Override
    public void trierEtudiantsParId() {
    Collections.sort(List2); 
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(List2 , new IdentiterNom() );
    }

}
