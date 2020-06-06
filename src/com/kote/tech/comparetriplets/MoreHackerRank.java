package com.kote.tech.comparetriplets;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;





public class MoreHackerRank {
	
	
	
	static String catAndMouse(int x, int y, int z) {
		
		if(Math.abs(z-x) > Math.abs(z-y))
			return "Cat B";
		else if(Math.abs(z-y) > Math.abs(z-x))
			return "Cat A";
		else
			return "Mouse C";

    }
	
	public static List<Integer> gradingStudents(List<Integer> grades) {
	    
		List<Integer> finalGrades = new ArrayList<Integer>();
		
		for(Integer grade:grades) {
			
			if(grade >= 38 && (5 - grade%5) < 3) {
				grade += (5 - grade%5);
			}			
			
			finalGrades.add(grade);
			
		}
		
		return finalGrades;

	}
	
	
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		
		Object appleVal[] = Arrays.stream(apples).mapToObj(n -> a+n).toArray();
		
		Object orangeleVal[] = Arrays.stream(oranges).mapToObj(n -> b+n).toArray();
		
		int appCount = 0;
		int orgCount = 0;
		
		for(int i=0; i < appleVal.length; i++) {
			
			if((Integer)appleVal[i] >= s && (Integer)appleVal[i] <= t) {
				++appCount;
			}			
		}
		
		for(int i=0; i < orangeleVal.length; i++) {
			
			if((Integer)orangeleVal[i] >= s && (Integer)orangeleVal[i] <= t) {
				++orgCount;
			}			
		}
		
		System.out.println(appCount);
		System.out.println(orgCount);
		

//		Arrays.stream(appleVal).filter(n -> ((int)n >= s && (int)n <= t )).count();
//		
//		System.out.println(Arrays.stream(orangeleVal).filter(n -> ((int)n >= s && (int)n <= t )).count());
		
		
    }


	public static void main(String[] args) {
		
		countApplesAndOranges(7,11,5,15,new int[]{-2,2,1},new int[] {5,-6});
		
		
//		int arr[] = new int[] {1,4,2,4};
//		
//		int max = Arrays.stream(arr).max().getAsInt();
//		
//		System.out.print(Arrays.stream(arr)
//				.filter(n -> (n==max))
//				.count());
//		
//		int count = (int)Arrays.stream(arr)
//        .filter(n -> (n==Arrays.stream(arr)
//        .max().getAsInt()))
//        .count();
//		
		
		
		
//		String s = "12:45:54PM";
//		
//		String arr[] = s.split(":");
//		
//		int hh = Integer.parseInt(arr[0]);
//		DecimalFormat formatter = new DecimalFormat("00");
//		
//		if(arr[2].contains("PM")) {
//			hh = hh==12?hh:hh + 12;
//			arr[2] = arr[2].replaceAll("PM","");
//		}else {
//			hh = hh==12?(hh-12):hh;
//			arr[2] = arr[2].replaceAll("AM","");
//		}
//		
//		System.out.print(formatter.format(hh)+":"+arr[1]+":"+arr[2]);
		
		
		//System.out.print(" Result "+catAndMouse(1,3,2));
		
		
		//List<Integer> gradeList = gradingStudents(Arrays.asList(73,67,38,33));
		//gradeList.forEach(System.out::println);
		
		
		
		
	}

}
