package com.kote.tech.math;
 import java.util.ArrayList;
import java.util.List;
 public class LargestPrimeFactor {
	
	public List calculatePrimeFactors(double primeNumber) {
		
	  List<Double> primeFactors = new ArrayList<Double>();
	  
	  double num =0;
	  double prevMul = 1;
		
		for(double i=1; i<primeNumber; i++) {
			
		  int counter=0; 	  
	      for(num = i; num>=1; num--)
		  {
	         if(i%num==0)
		     {
	        	 counter = counter + 1;
		     }
	         if(counter>2)
	         break;
		  }
		  if (counter==2)
		  {
		     if(primeNumber%i == 0){
		    	 prevMul = prevMul *  i;
		    	 primeFactors.add(i);
		    	 System.out.println("prevMul = "+prevMul);
		     }      
		     
		     if(prevMul>=primeNumber)
		    	 break;
		  }	 
			
		}
		
		return primeFactors;
	}
 	public static void main(String[] args) throws Exception  {
		
		LargestPrimeFactor largestFactor = new LargestPrimeFactor();
		
		List<Double> primeFactors = largestFactor.calculatePrimeFactors(200.0);
		
		for(double factor : primeFactors){
			System.out.println(factor);
		}	
 	}
 }