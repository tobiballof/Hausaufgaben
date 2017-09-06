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
class Insertion implements Sortierer{

    @Override
    public ArrayList<Integer> sortiere(ArrayList<Integer> xlist) {
                ArrayList<Integer> list = ((ArrayList<Integer>) xlist.clone());

        int sort;
        for(int i = 0; i<list.size(); i++){
            
            for(int listlength = list.size() - 1; listlength > 0; listlength--){
                
                sort = list.get(listlength);
                list.set(listlength, list.get(listlength -1));
                list.set(listlength -1, sort);
            }
            
            
        }
        
        return list;
    }
    
}
