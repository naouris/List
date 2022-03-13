/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author ACER
 */
public class Etudiant implements Comparable<Etudiant>{
    private int id;
    private String nom;
        private String prenom;
 
        public Etudiant(){}
    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etudiant other = (Etudiant) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

//    @Override
//    public int compareTo(Etudiant t) {
//         if (this.id>t.id)
//            return 1;
//        else if (this.id<t.id)
//            return -5;
//        else 
//            return 0;
//    }

    @Override
    public int compareTo(Etudiant t) {
        if (this.id-t.id>0)
            return 5;
      else  if  (this.id-t.id<0)
            return -8;
       else return 0;
//        return this.id-o.id;
    }

   
        

    
    
}
