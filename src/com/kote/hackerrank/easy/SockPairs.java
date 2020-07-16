package com.kote.hackerrank.easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockPairs {

//Another Solution using HashSet
	
//	Set<Integer> colors = new HashSet<>();
//    int pairs = 0;
//
//    for (int i = 0; i < n; i++) {
//        if (!colors.contains(c[i])) {
//            colors.add(c[i]);
//        } else {
//            pairs++;
//            colors.remove(c[i]);
//        }
//    }
//	System.out.println(pairs);
	
//Time Complexity: O(n)
//Space Complexity: O(n)
	
	
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	
    	Map<Integer,Integer> sockMap = new HashMap<Integer,Integer>();
    	//int numberOfPairs = 0;
    	
    	//Java 8 way of iteration using lambda
    	Arrays.stream(ar).forEach(elm -> sockMap.put(elm, sockMap.getOrDefault(elm, 0)+1));
    	
    	//Prior Java8 way
//    	for(int elm: ar)  		
//    		sockMap.put(elm, sockMap.getOrDefault(elm, 0)+1);    		
//    	
    	
    	//Prior Java8 way
//    	for(Integer key : sockMap.keySet()) {    		
//    		numberOfPairs += sockMap.get(key)/2;    		
//    	}  
    	
    	//Java 8 way using lambda
    	return sockMap.values().parallelStream().mapToInt(val -> val/2).sum();
    	
    	//return numberOfPairs;   		

    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] ar = new int[n];
//
//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }
//
//        int result = sockMerchant(n, ar);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    	
    	System.out.print("Pairs of socks John can sell "
    			+SockPairs.sockMerchant(9, new int[] {10,20,20,10,10,30,50,10,20}));
    }
}


