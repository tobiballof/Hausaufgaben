/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_003_sortieren;

import java.util.ArrayList;

/**
 *
 * @author B201
 */
class Selection implements Sortierer{

    @Override
    public ArrayList<Integer> sortiere(ArrayList<Integer> list) {
        int index, sort;
        
        for(int i = list.size() - 1; i>=1; i--){
            
            index = 0;
            for(int j = 1; j<=i; j++){
                
                if(list.get(j) > list.get(index)){
                    
                    index = j;
                }
            }
            sort = list.get(index);
            list.set(index, list.get(i));
            list.set(i, list.get(index));
        }
        return list;
    }
    
}
