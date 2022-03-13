/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;
import java.util.Comparator;
/**
 *
 * @author ACER
 */
public class IdentiterNom  implements Comparator<Etudiant>{

    @Override
    public int compare(Etudiant t, Etudiant t1) {
        return t.getNom().compareTo(t1.getNom());
                
    }
    
}
