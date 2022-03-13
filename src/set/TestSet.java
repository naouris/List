/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ACER
 */
public class TestSet {
     public static void main(String[] args) {
     Set<String>set=new HashSet<>();
          Set<String>set1=new HashSet<>();

     set.add("test");
          set.add("test");
     set.add("atest");
          set.add("test2");


     set1.addAll(set);
     
//     set.remove(set);
//         System.out.println(set.contains("teste"));
         for(String s:set1){
             System.out.println(s);
         }
     }
}
