package com.kote.tech.string;

public class DeleteConcecutiveString {
	
	static int deleteConcecutiveString(String s) {
		
		char[] carr = s.toCharArray();
		int count = 0;
		
		for(int i=0; i < carr.length; i++) {
			
			if(i+1 < carr.length && carr[i] == carr[i+1]) {
		
				++count;	
				
			}
		}		
		return count;
		
	}
	
	
	
	public static void main(String[] args) {
 		System.out.println("AAAA = "+deleteConcecutiveString("AAAA"));
		System.out.println("BBBBB = "+deleteConcecutiveString("BBBBB"));
		System.out.println("ABABABAB = "+deleteConcecutiveString("ABABABAB"));
		System.out.println("BABABA = "+deleteConcecutiveString("BABABA"));		
		System.out.println("AAABBB = "+deleteConcecutiveString("AAABBB"));
	}
 }