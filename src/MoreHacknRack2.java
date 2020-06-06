import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MoreHacknRack2 {

	static String kangaroo(int x1, int v1, int x2, int v2) {

		String result = "";
		int x =0, y=0;
		
		while(x<10000 || y<10000) {
			
			if(x1+v1 == x2+v2 && x==y) {
				result = "YES";
				break;
			}
			
			x1 += v1; ++x;
			x2 += v2; ++y;		
		}
				
		return result.equals("") ? "NO" : result;
    }
	
	public static int getTotalX(List<Integer> a, List<Integer> b) {
       int result = 0;
       
       int lastA = a.get(a.size()-1);
       int firstB = b.get(0);
       
       for(int i=lastA;i<=firstB;i++) {
    	   
    	   final long div = i;
    	   
    	   long aCount = a.stream().filter(n -> (div%n==0)).count();
    	   
    	   long bCount = b.stream().filter(n -> (n%div==0)).count();
    	   
    	   if(a.size() == aCount && b.size() == bCount) {
    		   ++result;
    	   }
       }       
       
       return result;

    }
	
	//@TODO try java 8 later
	static int[] breakingRecords(int[] scores) {
		
		int best = scores[0];
		int worst = scores[0];
		
		int recordbest = 0,recordworst = 0;		
		
		for(int i=0; i<scores.length;i++) {
			
			if(scores[i] > best) {
				best = scores[i];
				++recordbest;
			}
			
			if(scores[i] < worst) {
				worst = scores[i];
				++recordworst;
			}
		}
				
		return new int[] {recordbest,recordworst};

    }
	
	static int birthday(List<Integer> s, int d, int m) {
		
		int count = 0;
		
		for(int i=0; i<s.size(); i++) {			
			int sum = 0;			
			for(int j=m-1; (j>=0 && (i+j)<s.size()); j--) {				
				sum += s.get(i+j);				
			}
			if(d==sum) ++count;
		}
		
		return count;

    }
	
	 static int divisibleSumPairs(int n, int k, int[] ar) {
		 
		 int count = 0;
		 
		 System.out.print(Arrays.stream(ar).distinct().count());
		 
		 
		 for(int i=0; i<n; i++) {
			 
			 for(int j=i+1; j<n; j++) {
				 
				 if((ar[i]+ar[j])%k == 0) ++count;
			 }
			 
		 }				 
		 return count;
	 }
	 
	 
	 static int distinctBird(List<Integer> arr) {
			 
		 List<Integer> distList = arr.stream().distinct().collect(Collectors.toList());
		 
		 int highFreqNum = 0; 
		 int highFreq = 0;
		 
		 for(Integer n: distList) {
			 
			 int newFreq = Collections.frequency(arr, n);
			 
			 if(newFreq > highFreq) {				 
				 highFreq = newFreq;
				 highFreqNum = n;
			 }else if(newFreq == highFreq) {
				 highFreqNum = highFreqNum > n ? n : highFreqNum;
			 }
			 
		 }		 
		 return highFreqNum;
	 }
	 
	 static String dayOfProgrammer(int year) {

//		 if(year%4==0)
//			 return "12.09."+year;
//		 else
//			 return "13.09."+year;
		 
	    if(year==1918) {
	        return "26.09.1918";
	    }
	    else if((year<1918 && year%4==0) ||(year>1918  &&(year%4==0 && year%100 !=0 || year%400==0))) {
	        return "12.09." + year;
	    }
	    else {
	        return "13.09." + year;
	    }

	 }

	
	public static void main(String[] args) {
		
		//System.out.println(kangaroo(0,3,4,2));
		//System.out.println(kangaroo(0,2,5,3));
		
		//System.out.println(getTotalX(Arrays.asList(2,4),Arrays.asList(16,32,96)));
		
		//Arrays.stream(breakingRecords(new int[] {10,5,20,20,4,5,2,25,1}))
		//.forEach(n -> System.out.print(n+" "));
		
		//System.out.println("Result : "+birthday(Arrays.asList(1,2,1,3,2),3,2));
		
		//System.out.println("Result : "+divisibleSumPairs(6,3,new int[] {1,3,2,6,1,2}));
		
		//System.out.println(distinctBird(Arrays.asList(1,2,3,4,5,4,3,2,1,3,4)));
		
		System.out.print(dayOfProgrammer(2017));

	}

}
