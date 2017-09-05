/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_003_sortieren;

import java.util.ArrayList;

/**
 *
 * @author B201 //1,36
 */
class Bubblesort implements Sortierer {
    
    public ArrayList<Integer> sortiere(ArrayList<Integer> list) {
        int sort;
        boolean unsortiert = true;
        
        while (unsortiert) {
            unsortiert = false;
            for (int i = 0; list.size() - 1 > i; i++) {
                
                if (list.get(i) > list.get(i + 1)) {
                    
                    sort = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, sort);
                    unsortiert = true;
                }
            }
            
        };
        
        return list;
    }
    
}
