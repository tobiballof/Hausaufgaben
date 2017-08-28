/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_002_boxlayout;

/**
 *
 * @author Tobi
 */
public class Plus implements Rechenoperation {

    @Override
    public int rechne(int a, int b) {
        
       return a + b;
    }

    
    @Override
    public String getSymbol() {
        return "+";
    }

}
