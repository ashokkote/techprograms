package com.kote.hackerrank.easy;

import java.io.*;
import java.math.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpendMaximum {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        
    	
//        keyboards = Arrays.stream(keyboards).boxed()
//        	    .sorted(Collections.reverseOrder())
//        	    .mapToInt(Integer::intValue)
//        	    .toArray();
        
//        drives = Arrays.stream(drives).boxed()
//        	    .sorted(Collections.reverseOrder())
//        	    .mapToInt(Integer::intValue)
//        	    .toArray();
        
        Arrays.stream(keyboards);
        
        

    	
        //Arrays.stream(keyboards).forEach(System.out::println);
    	//Arrays.stream(drives).forEach(System.out::println); 
    	
    	int maxSpent = -1;
    	
    	for(int keyboard : keyboards) {
    		for(int drive : drives) {
//    			/int spent = keyboard + drive;
    			if(keyboard + drive <= b) 
    			maxSpent = Math.max(maxSpent, keyboard + drive);
    		}    		
    	}

    	return maxSpent;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String[] bnm = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
//
//        int b = Integer.parseInt(bnm[0]);
//
//        int n = Integer.parseInt(bnm[1]);
//
//        int m = Integer.parseInt(bnm[2]);
//
//        int[] keyboards = new int[n];
//
//        String[] keyboardsItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
//
//        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
//            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
//            keyboards[keyboardsItr] = keyboardsItem;
//        }
//
//        int[] drives = new int[m];
//
//        String[] drivesItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
//
//        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
//            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
//            drives[drivesItr] = drivesItem;
//        }
//
//        /*
//         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
//         */
//
//        int moneySpent = getMoneySpent(keyboards, drives, b);
//
//        bufferedWriter.write(String.valueOf(moneySpent));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
        
        int b=10,n=2,m=3;        
        int [] k = new int []{3, 1};
        int [] u = new int []{5, 2, 8};
        
        System.out.println("1.maximumSpent = "+getMoneySpent(k,u,b));
        
        b = 622830;
        
        String kbstr = Files.lines(
        	Paths.get("/Users/ashok/practice/techprograms/src/com/kote/hackerrank/easy/keyboard.txt"))
        		.collect(Collectors.joining());
        
        String usbstr = Files.lines(
            	Paths.get("/Users/ashok/practice/techprograms/src/com/kote/hackerrank/easy/usbdrive.txt"))
        		.collect(Collectors.joining());
        
        k = Arrays.stream(kbstr.split(" ")).
        		map(kb -> Integer.parseInt(kb)).mapToInt(Integer::intValue).toArray();
        
        u = Arrays.stream(usbstr.split(" ")).
        		map(ud -> Integer.parseInt(ud)).mapToInt(Integer::intValue).toArray();
      
        System.out.println("2.maximumSpent = "+getMoneySpent(k,u,b));
        
    }
}

