package com.company;

import java.util.Random;
import java.util.Arrays;

public class RandomMatrix {
    public static int[][] CreateRandomMatrix(int[][] arr, int min, int max){
        Random random = new Random();
        int diff = max - min;
        for(int i = 0; i < arr[0].length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[j][i] = random.nextInt (diff+1);
                arr[j][i]+= min;
            }
        }
        for (int[] y : arr) {
            for (int x : y) {
                System.out.print(x + "   \t");
            }
            System.out.println();
        }
        return arr;
    }
}
