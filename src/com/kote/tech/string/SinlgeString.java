package com.kote.tech.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SinlgeString {
	

	public boolean isSingleDistinct(String subString) {
		
		//System.out.println(subString);
		
		char[] charr = subString.toCharArray();
		
		Map<Character, Integer> duplicates = new HashMap<Character, Integer>();
		
		int count = 0;
		
		for(char ch: charr) {
			
			if(!duplicates.containsKey(ch)) {
			    duplicates.put(ch, 1);
			}else {
				duplicates.put(ch, duplicates.getOrDefault(ch, 0) + 1);
				count ++;
			}			
		}
		
		
		if(count == 1) {
			return true;
		}
	
		return false;
		
		
	}
	
	// DEFINE ANY CLASS AND METHOD NEEDED
	// CLASS BEGINS, THIS CLASS IS REQUIRED
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	    public List<String> subStringsLessKDist(String inputString, int num)
		{
	        // WRITE YOUR CODE HERE
	        if(inputString  == null || inputString.length() < num) {
	            return new ArrayList<String>();
	        }
	        
	        int i = 0;
	        List<String> result = new ArrayList<String>();
	        
	        while((i+num) <= inputString.length()) {
	        	
	        	String subString = inputString.substring(i, i+num);
	        	
	        	if(isSingleDistinct(subString)) {
	        		result.add(subString);
	        	}       	
	        	
	        	i++;	 
	        }
	        
	        return result;
	        
	    }
	    // METHOD SIGNATURE ENDS


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinlgeString ss = new SinlgeString();
		
		List<String> result = ss.subStringsLessKDist("democracy", 5);
		
		result.forEach(System.out::println);

	}

}
