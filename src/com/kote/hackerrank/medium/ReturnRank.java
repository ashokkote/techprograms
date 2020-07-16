package com.kote.hackerrank.medium;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ReturnRank {

	//Terminated due to timeout  - 3 TC failed on Time Limits
	
    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
    	
    	scores = Arrays.stream(scores).boxed()
    		.sorted(Collections.reverseOrder())
    		.mapToInt(Integer::intValue)
    		.toArray();

    	List<Integer> aliceRanks = new ArrayList<Integer>();
    	
    	TreeMap<Integer, Integer> rankMap = new TreeMap<Integer, Integer>();
    	int rank = 1;
    	
    	for(int score : scores) {
    		
    		if(!rankMap.containsKey(score)) {
    			rankMap.put(score, rank);
    			rank ++;
    		}
    	}
    	
    	for(int score : alice) {
    		
    		if(rankMap.get(score)!=null) {
    			aliceRanks.add(rankMap.get(score));
    		} else {
    			
    			 int cur = scores[0];
    			 if(score > cur) {
					 aliceRanks.add(1);
	   			 } else if(score < scores[scores.length-1]) {
	    				 aliceRanks.add(rankMap.size()+1);
				 } 
				 else {
					 
					 List<Integer> list = new ArrayList<Integer>(rankMap.keySet());
					 Collections.sort(list, Collections.reverseOrder());
					 
					 //Using TreeMap 
					 Map.Entry<Integer,Integer> closeHigh = rankMap.ceilingEntry(score);
					 aliceRanks.add(rankMap.get(closeHigh.getKey())+1);
					 
					 for(Integer key : list) {
						 
						 
	    				 Map.Entry<Integer,Integer> high = rankMap.ceilingEntry(score);
	    				 
	    				 Integer res = 0;
	    		
	    				if(score < cur && score > key) {
	    					aliceRanks.add(rankMap.get(cur)+1);
	    				}
	    				cur = key; 					 
	    			 }
				 }     			 
    		}    		
    	}    	
    	return aliceRanks.stream().mapToInt(Integer::intValue).toArray();
    }
    
    //Terminated due to timeout  - 4 TC failed on Time Limits
    static int[] climbingLeaderboardusingTreeMap(int[] scores, int[] alice) {
    	
    	scores = Arrays.stream(scores).boxed()
    		.sorted(Collections.reverseOrder())
    		.mapToInt(Integer::intValue)
    		.toArray();

    	List<Integer> aliceRanks = new ArrayList<Integer>();
    	
    	TreeMap<Integer, Integer> rankMap = new TreeMap<Integer, Integer>();
    	int rank = 1;
    	
    	for(int score : scores) {
    		
    		if(!rankMap.containsKey(score)) {
    			rankMap.put(score, rank);
    			rank ++;
    		}
    	}
    	
    	for(int score : alice) {
    		
    		if(rankMap.get(score)!=null) {
    			aliceRanks.add(rankMap.get(score));
    		} else {
    			
    			 int cur = scores[0];
    			 if(score > cur) {
					 aliceRanks.add(1);
    			 }
    			 else {
    				 
    				 List<Integer> list = new ArrayList<Integer>(rankMap.keySet());
    				 Collections.sort(list, Collections.reverseOrder());
    				 
    				 //Using TreeMap 
    				 Map.Entry<Integer,Integer> closeHigh = rankMap.ceilingEntry(score);
    				 aliceRanks.add(rankMap.get(closeHigh.getKey())+1);   				 

    			 }	 
    			 
    		}
    		
    	}
    	
    	return aliceRanks.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) throws IOException {
    	
    	 int [] scores = {100,100,50,40,40,20,10};
    	 int [] aliceScores = {5,25,50,120};
    	 
    	 
    	 //int [] output = climbingLeaderboard(scores, aliceScores);
    	 
    	 int [] output = climbingLeaderboardusingTreeMap(scores, aliceScores);
    	
    	 Arrays.stream(output).forEach(e -> System.out.print(" "+e));
    	
    }
       
}