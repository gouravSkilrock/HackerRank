package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DesignerPDFFormat {

	public static void main(String[] args) {
		Map<Character, Integer> map=new HashMap<>();
		Character ch='a';
		Scanner in=new Scanner(System.in);
		for(int i=0;i<26;i++){
			int val=in.nextInt();
			map.put(ch, val);
			ch++;
		}
		String inputWord =in.next();
		int max=0;
		for(int i=0;i<inputWord.length();i++){
			for(Entry<Character, Integer> entry: map.entrySet()){
				if(entry.getKey()==inputWord.charAt(i)){
					if(max<entry.getValue()){
						max=entry.getValue();
					}
				}
			}
		}
		
		System.out.println(max*inputWord.length());
		
	}

}
