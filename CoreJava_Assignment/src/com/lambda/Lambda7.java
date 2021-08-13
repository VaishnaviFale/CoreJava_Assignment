package com.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lambda7 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
	    map.put(10, "apple");
	    map.put(20, "orange");
	    map.put(30, "banana");
	    map.put(40, "watermelon");
	    map.put(50, "dragonfruit");
	    System.out.println("Original elements          : " + map);
	    
	    List<String> list = map.entrySet()
                .stream()
                .map(entry -> entry.getKey() + "-" + entry.getValue())
                .sorted()
                .collect(Collectors.toList());
	    System.out.println("Updated elements           : " + list);
	}

}
