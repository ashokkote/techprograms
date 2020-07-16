package com.kote.hackerrank.easy;



	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.function.*;
	import java.util.regex.*;
	import java.util.stream.*;
	import static java.util.stream.Collectors.toList;

	public class PickNumbers {

	    /*
	     * Complete the 'pickingNumbers' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts INTEGER_ARRAY a as parameter.
	     */

	    public static int pickingNumbers(List<Integer> a) {
	    
	    	Collections.sort(a);
	    	
	    	//List<List<Integer>> resultList = new ArrayList();
	    	
	    	int maxValue = Integer.MIN_VALUE;
	    	
	    	//a.forEach(i -> System.out.print(" "+i));
	    	
	    	for(int i=0; i<a.size(); i++) {
	    		
	    		//List<Integer> possible = new ArrayList<Integer>();
	    		int count = 0;
	    			    		
	    		for(int j=i; j<a.size(); j++) {
	    			if(Math.abs(a.get(i)-a.get(j)) > 1) 
	    				break;
	    			
	    			count++;
	    			//possible.add(a.get(j));
	    		}
	    		
//	    		if(possible.size() > 1)
//	    			resultList.add(possible);
	    		
//	    		if(maxValue < possible.size())
//	    			maxValue = possible.size();
	    		
	    		maxValue = count > maxValue ? count : maxValue;
	    	}    	
	    	
	    	//return resultList.stream().mapToInt(i -> i.size()).max().getAsInt();
	    	return maxValue;

	    }
	    
	    public static void main(String[] args) throws IOException {
		    
	    	List inputList = Arrays.asList(1,2,2,3,1,2);
	    	
	    	System.out.println("\nMax Pick = "+pickingNumbers(inputList));
	    	
	    }
	}

