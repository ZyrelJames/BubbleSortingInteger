
package BubbleSortingInteger;

import java.util.Arrays;


public class BubbleSortingInteger {
    
    public static void main(String [] args){
     
        int[] array = { 26,37,25,12,22,54,90 };
       
    
        
        System.out.println("Original Array:" + Arrays.toString(array));
        
        BubbleSortInteger (array);
 
        System.out.println("Sorted Array:" + Arrays.toString(array));
        
               
    }
    static void BubbleSortInteger(int[]arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
        for (int j = 0; j < n - 1; j++){
            if (arr[j] > arr[j + 1]){
                // swap temp and arr[i]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j+1] = temp;
            }
        
        
    }
    }
    }
}

