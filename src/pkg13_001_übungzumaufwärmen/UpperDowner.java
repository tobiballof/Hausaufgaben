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
public class UpperDowner implements Aenderer{

    @Override
    public String manipuliere(String string) {
        
        char[] chars = string.toCharArray();
        
        for (int i = 0; i<chars.length; i++){
            
            char c = chars[i];
            
            if(Character.isUpperCase(c)){
                
                chars[i] = Character.toLowerCase(c);
            } else{
                
                chars[i] = Character.toUpperCase(c);
            }
        } 
        return new String(chars);
    }
    
    public String toString(){
        
        return "UpperDowner";
    }
}
