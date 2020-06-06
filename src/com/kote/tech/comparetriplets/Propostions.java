package com.kote.tech.comparetriplets;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Propostions {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	
    	double pos = 0, neg=0, zero =0;
    	
    	for(int i=0; i < arr.length; i++) {
    		
    		if(arr[i] > 0)
    			++pos;
    		else if(arr[i] < 0)
    			++neg;
    		else 
    			++zero;    		
    	}
    	
    	DecimalFormat nf = new DecimalFormat("#.000000");
    	
    	System.out.println(nf.format(pos/arr.length));
    	System.out.println(nf.format(neg/arr.length));
    	System.out.println(nf.format(zero/arr.length));

    }
    
    static void staircase(int n) {
    	
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<n; j++) {
    			if(i+j >= n-1)
    				System.out.print("#");
    			else
    				System.out.print(" ");
    		}
    		System.out.println();
    	}
    	
    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        int[] arr = new int[n];
    	
    	//int n = 6;

//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }

    	//int[] arr = new int[] {100,20,-2,0,8,-19,-8};
    	
        //plusMinus(arr);
    	
    	//staircase(6);
    	
    	
    	int[] arr = new int[] {769082435,210437958,673982045,375809214,380564127};
    	
    	long min = Arrays.stream(arr).min().getAsInt();
    	long max = Arrays.stream(arr).max().getAsInt();
    	
    	long maxSum = 0;
    	long minSum = 0;
    	
    	boolean skippedMax = false, skippedMin=false;
    	
    	for(int i=0; i<arr.length; i++) {
    		
    		if(arr[i] != max || skippedMax) {
    			minSum += arr[i];
    		}else {
    			skippedMax = true;
    		}
    		
    		if(arr[i] != min || skippedMin) {
    			maxSum += arr[i];
    		}else {
    			skippedMin = true;
    		}
    		
    	}   	
    	
    	System.out.print(minSum+" ");
    	System.out.print(maxSum);
    	
//    	long sum = (long)Arrays.stream(arr).sum();
//    	
//    	System.out.print(sum - max);
//    	System.out.print(sum - min);
    	
        //scanner.close();
    }
}
