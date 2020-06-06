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

public class CompareTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	List<Integer> result = new ArrayList<Integer>();  
    	int alice = 0,bob = 0;
      	
    	for(int i=0; i<a.size(); i++) {
    		if(a.get(i) > b.get(i)) 
    			++alice;
    		else if(b.get(i) > a.get(i)) 
    			++bob;
    		
    	}
    	
    	result.add(alice);
    	result.add(bob);
    	
    	return result;

    }

    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
    	
    	List<Integer> a = Arrays.asList(10,12,19);
    	List<Integer> b = Arrays.asList(9,22,21);

        List<Integer> result = compareTriplets(a, b);

//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining(" "))
//            + "\n"
//        );

        System.out.println(Arrays.toString(result.toArray()));
        
        //bufferedReader.close();
        //bufferedWriter.close();
    }
}
