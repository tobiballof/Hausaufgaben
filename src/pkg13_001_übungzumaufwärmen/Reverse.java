/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_001_übungzumaufwärmen;

/**
 *
 * @author B201
 */
public class Reverse implements Aenderer {

    @Override
    public String manipuliere(String string) {
        
        return new StringBuffer(string).reverse().toString();
        
    }
    
    public String toString(){
        
        return "Reverse";
    }
}
