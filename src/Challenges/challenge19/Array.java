package Challenges.challenge19;

import javax.swing.text.ChangedCharSetException;

public class Array {

    public static int arrayMinimum(int[] array) {
        int currentSmallest = Integer.MAX_VALUE;
        for (int data : array){
            if(data < currentSmallest) {
                currentSmallest = data;
            }
        }
        return currentSmallest;
    }

    public static double arrayAverage(int[] array) {
        int total = 0;
        for(int data : array) {
            total += data; // totaal van array
        }
        double average = (double) total / array.length;
        return average;
    }
}

//Changes
//        for (int index = 0; index < array.length; index++) {
//            if (array[index] < currentSmallest)
//                currentSmallest = array[index];
//        }

//        for (int index = 0; index < array.length; index++)
//            total += array[index];

//        System.out.println("Average: " + average);
