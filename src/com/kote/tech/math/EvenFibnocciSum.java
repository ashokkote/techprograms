package com.kote.tech.math;

public class EvenFibnocciSum {
	
	public int calculateSumOfEvenFibnocci(int range) {
		
		int sum = 0;
		int evensum = 0;	
		int previousNumber = 0;
		int nextNumber = 1;
		
		String numbers = "";	
		
		for(int i=1; i<=range; i++) {
			
			sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            
            if(sum%2==0){
            	evensum += sum;
            }
                        
			numbers = numbers + sum + "," ;
		}
		
		System.out.println("numbers = "+numbers);
		
		return evensum;
	}
	
	

	public static void main(String[] args) {
		
		EvenFibnocciSum sumOfFibnocci = new EvenFibnocciSum();
		
		int sum = sumOfFibnocci.calculateSumOfEvenFibnocci(20);
		
		System.out.println("Even Sum = "+sum);
		

	}

}
