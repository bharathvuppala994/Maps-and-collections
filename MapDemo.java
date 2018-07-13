package com.siri.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		/*
		String word = "Java assignment";
		
		Map<Character, Integer> wordMap = new LinkedHashMap<Character, Integer>();
		
		for(Character ch : word.toCharArray()) {
			if(wordMap.containsKey(ch)) {
				int count = wordMap.get(ch);
				wordMap.put(ch, ++count);
			} else {
				wordMap.put(ch, 1);
			}
			
		}
        
        wordMap.forEach((k,v) -> System.out.println(k + " : " + v));*/
        
        
        List<String> strList = new ArrayList<String>();
        
        strList.add("Rahul");
        strList.add("Rahul K");
        strList.add("Manoj");
        strList.add("Bharath");
        strList.add("Kranthi"); 
        strList.add("Dhruv");
        strList.add("Dhruv");
        
        /*strList.stream().map(s -> s + "123")
        				.filter(s -> s.startsWith("R"))
        				.forEach(item -> System.out.println(item));
        */
        
       Map<String,Integer> newOne =  strList.stream()
		.collect(Collectors.toMap(s ->s.toString(), s -> s.length()));
       
       newOne.forEach((k,v) -> System.out.println( k + " : " + v));

//Comparator
       //COmparable
       
      /* ArrayList<SiriEmployee> siriEmployeeList = new ArrayList<SiriEmployee>();
       
       Comparator<SiriEmployee> myCompByName = new Comparator<SiriEmployee>() {

		@Override
		public int compare(SiriEmployee o1, SiriEmployee o2) {
			return o1.getFname().compareTo(o2.getFname());
		}
    	   
	};
		
		siriEmployeeList.add(new SiriEmployee(1, "Kranti", "k@siri", 90));
		siriEmployeeList.add(new SiriEmployee(1111, "Rahul", "R@siri", 290));
		siriEmployeeList.add(new SiriEmployee(100, "Manoj", "m@siri", 190));
		
		siriEmployeeList.add(new SiriEmployee(199, "Dhruv", "D@siri", 390));*/
		
		//Collections.sort(siriEmployeeList, new EmployeeComparator());
		//Collections.sort(siriEmployeeList, myCompByName);
		
		//siriEmployeeList.forEach(item -> System.out.println(item));
		


	}

}
