/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_003_sortieren;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author B201
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> zahlenUnsort = new ArrayList<>();
        ArrayList<Integer> zahlenSort = new ArrayList<>();

      //  Random rnd = new Random();

        /* for (int i = 0; size > i; i++){
            
            zahlenliste.add(rnd.nextInt());
        }
         */
        zahlenUnsort.add(5);
        zahlenUnsort.add(7);
        zahlenUnsort.add(10);
        zahlenUnsort.add(591);
        zahlenUnsort.add(90);
        zahlenUnsort.add(51);
        zahlenUnsort.add(55);
        zahlenUnsort.add(1);

        System.out.println("Unsortierte Zahlen:");
        for (int i : zahlenUnsort) {

            System.out.println(i);
        }

        System.out.println("BubbleSort:");
        Bubblesort bubble = new Bubblesort();
        zahlenSort = bubble.sortiere(zahlenUnsort);
        for (int i : zahlenSort) {
            System.out.println(i);
        }
        zahlenSort = new ArrayList<>();

        
        System.out.println("Insertsort");
        Insertion insert = new Insertion();
        zahlenSort = insert.sortiere(zahlenUnsort);
        for(int i : zahlenSort){
            
            System.out.println(i);
        }
        zahlenSort = new ArrayList<>();
        
        System.out.println("SelectionSort");
        Selection select = new Selection();
        zahlenSort = select.sortiere(zahlenUnsort);
        
        for(int i : zahlenSort){
            
            System.out.println(i);
        }
        
        
        

    }

}
