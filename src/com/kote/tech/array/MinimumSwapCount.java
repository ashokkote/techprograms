package com.kote.tech.array;

public class MinimumSwapCount {

	
	// Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            
        	int pos = -1;
        	if(arr[i] != i+1) {        	
        		
        		for (int j = i; j < arr.length ; j++) {
        			
        			if(arr[j] == i+1) {
        				pos = j;
        				break;
        			}
        			
        		}
        	}
        	
        	if(pos != -1) {
        		int temp = arr[i];
        		arr[i] = arr[pos];
        		arr[pos] = temp;
        		
        		++min;
        	}          
            
        }

        return min;
    }
    
    
	public static void main(String[] args) {

		int[] arr = {4,3,1,2};		
		
		System.out.println("Minimum number of swaps = "+minimumSwaps(arr));
		

	}

}
