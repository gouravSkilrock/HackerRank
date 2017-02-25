package com.practice;

import java.util.HashMap;
import java.util.Map;

public class demoOfMap {
    public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		
		map.put(1, "mayank");
		map.put(10, "mayank");
		map.put(100, "mayank");
		map.put(1000, "mayank");
		map.put(10000, "mayank");
		map.put(100000, "mayank");
		
		for(String s: map.values()){
			System.out.println("NAme is : "+s);
		}
				
				
	}
}
