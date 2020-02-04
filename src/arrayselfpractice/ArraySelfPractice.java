/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayselfpractice;

import java.util.Arrays;
/**
 *
 * @author 420190327
 */
public class ArraySelfPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] Food = {"Banana", "Apple", "Pear", "Orange", "Mango"};
        for (int i=0; i<Food.length;i++){
            System.out.println(Food[i]);
        }
        System.out.println(Arrays.toString(Food));
        
        int[] Nums = {21, 43, 13, 64, 76 ,34};
        Arrays.sort(Nums);
        System.out.println(Arrays.toString(Nums));
    }
    
}
