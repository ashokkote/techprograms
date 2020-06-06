package com.kote.tech.comparetriplets;

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
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    	
    	int difference = 0;
    	int sumLeft =0, sumRight=0;
    	
    	for(int i=0; i<arr.size(); i++) {
    		
    		for(int j=0; j<arr.get(i).size(); j++) {
    			
    			if(i==j) {
    				sumLeft += arr.get(i).get(j);
    			}
    			
    			if(i+j == arr.size()-1) {
    				sumRight += arr.get(i).get(j);
    			}
    			
    		}    		
    	}
    	  	
    	return java.lang.Math.abs(sumRight-sumLeft);
    }

}

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();
        
        List<Integer> ar1 = Arrays.asList(23,10,21);
        List<Integer> ar2 = Arrays.asList(10,10,10);
        List<Integer> ar3 = Arrays.asList(10,10,-120);
        
        arr.add(ar1);
        arr.add(ar2);
        arr.add(ar3);

//        IntStream.range(0, n).forEach(i -> {
//            try {
//                arr.add(
//                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                        .map(Integer::parseInt)
//                        .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });

        int result = Result.diagonalDifference(arr);
        
        System.out.print("result = "+result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

