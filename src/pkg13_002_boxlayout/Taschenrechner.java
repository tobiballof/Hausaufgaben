/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_002_boxlayout;

import java.util.ArrayList;

/**
 *
 * @author Tobi
 */
class Taschenrechner {
    
    private ArrayList<String> list = new ArrayList();

    public Taschenrechner() {
        
        list.add(new Plus().getSymbol());
        list.add(new Minus().getSymbol());
    }
    
    
    
    
}
