package com.siri.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
List<String> strList = new ArrayList<String>();
        
        strList.add("Rahul");
        strList.add("Rahul K");
        strList.add("Manoj");
        strList.add("Bharath");
        strList.add("Dhruv");
        
        Map<Object, Object> newOne =  strList.stream()
        		.collect(Collectors.toMap(s ->s.toString(), s -> s.toLowerCase()));
               
        newOne.forEach((k,v) -> System.out.println( k + " : " + v));

	}

}
