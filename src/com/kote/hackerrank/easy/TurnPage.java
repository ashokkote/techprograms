package com.kote.hackerrank.easy;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TurnPage {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
    	
    	int turnPage = 0;
    	
    	if(n%2==0)  n = n+1;
    	
    	if(p > n/2) {
    		
    		for(int i=n-1; i>p; i=i-2) 
    			turnPage++;
    		
    	} else {
    		for(int i=1; i<p; i=i+2) 
    			turnPage++;
    	}
    	
    	
    	return turnPage;
    	
    	//Best Solution
    	//return Math.min(p/2, n/2-p/2);
    	//O(1)
    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
//
//        int p = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
//
//        int result = pageCount(n, p);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    	
    	System.out.println("Number of Pages tobe Turned : "+pageCount(5,4));
    	System.out.println("Number of Pages tobe Turned : "+pageCount(6,2));
    	System.out.println("Number of Pages tobe Turned : "+pageCount(6,5));
    }
}
