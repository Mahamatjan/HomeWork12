package com;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        method();

    }
    private static int [] massiv(){
        Random random = new Random();
        int [] arr = new int[20];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = random.nextInt(0,100);

        }
        return arr;
    }
    static  void method(){
        int [] array = massiv();
        for (int i = 0; i < array.length; i++) {
            if (array[i]>50){
                System.out.print(array[i]+" ");
            }

        }
    }



}


