package com.kote.hackerrank.medium;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'maxEvents' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arrival
     *  2. INTEGER_ARRAY duration
     */

    public static int maxEvents1(List<Integer> arrival, List<Integer> duration) {
    // Write your code here
        if(!(arrival.size() == duration.size()))
            return 0;
        
        int [][] events = new int [arrival.size()][2];
//        int totEvents = 0;
        
//        for(int i=0; i<arrival.size(); i++) {
//        	
//        	events[i][0] = arrival.get(i);
//        	events[i][1] = arrival.get(i) + duration.get(i);
//        }
        
        for(int i=0; i<arrival.size(); i++) {
        	
        	events[i] = new int[] {arrival.get(i), arrival.get(i) + duration.get(i)};
        }
        
        Arrays.parallelSort(events, (a,b) -> (a[1]-b[1]));
        
        Queue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        
        int[] first = events[0];
        
        //int curEvtEndTime = events[0][1];
        
//        for(int i=1; i<events.length; i++) {
//        	if(curEvtEndTime <= events[i][0]) {
//        		curEvtEndTime = events[i][1];
//        		totEvents ++;
//        	}
//        }
        
        for(int i=1; i<events.length; i++) {
        	int [] cur = events[i];
        	
        	if(cur[0] < first[1]) {
        		minHeap.offer(cur);
        		
        	}
        	else {
        		first[1] = events[i][1];
        	}
        }
        
        return arrival.size() - minHeap.size();

        //return totEvents+1;

    }
    
    
    public static int maxEvents(List<Integer> arrival, List<Integer> duration) {

        if(!(arrival.size() == duration.size()))
            return 0;
        
        int [][] events = new int [arrival.size()][2];
        
        for(int i=0; i<arrival.size(); i++) {
        	
        	events[i] = new int[] {arrival.get(i), arrival.get(i) + duration.get(i)};
        }
        
        Arrays.parallelSort(events, (a,b) -> (a[1]-b[1]));
        
        Queue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        
        int[] first = events[0];

        for(int i=1; i<events.length; i++) {
        	int [] cur = events[i];
        	
        	if(cur[0] < first[1]) {
        		minHeap.offer(cur);
        		
        	}
        	else {
        		first[1] = events[i][1];
        	}
        }
        
        return arrival.size() - minHeap.size();
    }

}


public class CareerFairEvents {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arrivalCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arrival = IntStream.range(0, arrivalCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine().replaceAll("\\s+$", "");
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//            .map(String::trim)
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        int durationCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> duration = IntStream.range(0, durationCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine().replaceAll("\\s+$", "");
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//            .map(String::trim)
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        int result = Result.maxEvents(arrival, duration);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    	
    	
    	List<Integer> arrival = Arrays.asList(1,3,3,5,7);
    	List<Integer> duration = Arrays.asList(2,2,1,2,1);
    	
    	int result = 0;
    	
          result = Result.maxEvents(arrival, duration);
    	
    	System.out.print("Number of Events = "+result);
    	
//    	 arrival = Arrays.asList(1,3,5);
//    	 duration = Arrays.asList(2,2,2);
//    	 
//    	 result = Result.maxEvents(arrival, duration);
//    	 
//    	 System.out.print("Number of Events = "+result);
//    	
//    	arrival = Arrays.asList(5,1,1,1,1,4);
//   	 duration = Arrays.asList(5,10,3,6,4,2);
//   	 
//   	 result = Result.maxEvents(arrival, duration);
//   	 
//   	 System.out.print("Number of Events = "+result);
    			
    	}
    	
    	
    }

