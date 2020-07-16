package com.kote.tech.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class PairString {
	String first;
	String second;
	
	PairString(String first, String second) {
		this.first = first;
		this.second = second;
	}
	
}

public class StringAssociation {
	
	List<String> largestItemAssociation(List<PairString> itemAssociation)
	{
		// WRITE YOUR CODE HERE
		
		List<String> strList =  new ArrayList<String>();
		
		//Compare elements between two lists
		for(int i=0;  i<itemAssociation.size()-1; i++) {
			List<String> temp  =  new ArrayList<String>();
			for(int j=i+1;  j<itemAssociation.size(); j++) {
				
				
				
				PairString curr = itemAssociation.get(i);
				PairString next = itemAssociation.get(j);
				
				//Validate all 4 Combinations
				if(curr.first.equalsIgnoreCase(next.first)) {
					temp.add(curr.first);
					temp.add(curr.second);
					temp.add(next.second);
				}
				if(curr.second.equalsIgnoreCase(next.second)) {
					
					temp.add(curr.first);
					temp.add(curr.second);
					temp.add(next.first);
					
				}
				if(curr.first.equalsIgnoreCase(next.second)) {
					temp.add(curr.first);
					temp.add(curr.second);
					temp.add(next.first);
				}
				if(curr.second.equalsIgnoreCase(next.first)) {
					
					temp.add(curr.first);
					temp.add(curr.second);
					temp.add(next.second);
					
				}
				
			}	
			
			if(temp.size() > strList.size()) {
				strList.clear();
				strList.addAll(temp);
			}
			
		}
		
		if(strList.isEmpty()) {
			PairString curr = itemAssociation.get(0);
			strList.add(curr.first);
			strList.add(curr.second);
		}
		
		Collections.sort(strList);
		
		return strList;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringAssociation sa =  new StringAssociation();
		
		PairString pr1 = new PairString("item1","item2");
		PairString pr2 = new PairString("item3","item4");
		PairString pr3 = new PairString("item4","item5");
		
		List<PairString> list = new ArrayList<PairString>();
		list.add(pr1);
		list.add(pr2);
		list.add(pr3);
	
		List<String> result = sa.largestItemAssociation(list);
		
		
		result.forEach(System.out::println);
		
	}

}
