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
        
        
        //Two Dimensional Arrays
        int[][] MultiNums = new int[3][3];
        MultiNums[0][0] = 1;
        MultiNums[0][1] = 2;
        MultiNums[0][2] = 3;
        
        MultiNums[1][0] = 4;
        MultiNums[1][1] = 5;
        MultiNums[1][2] = 6;
        
        MultiNums[2][0] = 7;
        MultiNums[2][1] = 8;
        MultiNums[2][2] = 9;
        
        for(int i = 0; i < MultiNums.length; i++) {
            System.out.println(Arrays.toString(MultiNums[i]));
        }

    }
    
}
