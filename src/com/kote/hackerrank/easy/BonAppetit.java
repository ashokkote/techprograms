package com.kote.hackerrank.easy;

import java.io.*;
import java.math.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BonAppetit {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {

    	if(bill.size() < 0)
    		return;
    	
    	//int sum = bill.stream().filter(i -> bill.indexOf(i) != k).mapToInt(i -> i).sum()/2;
    	
    	int sum = (IntStream.range(0,bill.size()).map(i -> i!=k?bill.get(i):0).sum()/2);
    	
    	System.out.print(bill.size() +" , "+bill.get(k)+", "+sum/2+"  : ");
       
    	System.out.println(sum == b ? "Bon Appetit" : (b-sum));
    	

    	

    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(nk[0]);
//
//        int k = Integer.parseInt(nk[1]);
//
//        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        int b = Integer.parseInt(bufferedReader.readLine().trim());
    	
    	 List<Integer> bill = Arrays.asList(10,5,6,10,15);
    	 

    	 bonAppetit(bill, 2, 20);
    	 
    	 bonAppetit(bill, 2, 23);
    	 
    	 String iputString;
    	 try (Stream<String> lines = Files.lines(
    			 Paths.get("/Users/ashok/practice/techprograms/src/com/kote/hackerrank/easy/bonAppetitData.txt"))) {
    		 //Convert Stream to String java8
    		 iputString = lines.collect(Collectors.joining());
    	 }
    	 
    	 //System.out.println(iputString);
    	 
    	 String [] arrInputString = iputString.split(" ");
    	 
    	 //System.out.println(arrInputString);
    	 
    	 List<Integer> intList = new ArrayList<Integer>();
    	 for(String eachStr : arrInputString){
    		   //System.out.println(eachStr);
    		   intList.add(Integer.parseInt(eachStr));
    	 }
    	 
    	 bonAppetit(intList, 92747, 249191240);
    	 

        //bufferedReader.close();
    }
}

