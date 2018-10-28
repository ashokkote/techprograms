package com.kote.tech.array;

public class SumofMultiples {
	
	public double calculateSumOfMultiples(int range) {
		
		double sum = 0;
		
		String numbers = "";
		
		
		for(int i=0; i<range; i++) {
			if(i%3==0 || i%5==0 ){
				sum +=  i ;	
				
				numbers = numbers + i + "," ;
			}					 
		}
		
		System.out.println("numbers = "+numbers);
		
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println("args = "+args[0]);
		
		SumofMultiples sumofMultiple = new SumofMultiples();
		
		double sum = sumofMultiple.calculateSumOfMultiples(Integer.parseInt(args[0]));
		
		System.out.println(sum);
		

	}

}
