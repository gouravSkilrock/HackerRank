package com.practice;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//System.out.println("how many no.");
		int n= in.nextInt();
		String arr[]=new String[n];
		//System.out.println("Enter nos.");
		for(int i=0;i<n;i++){
			arr[i]=in.next();
		}
		int count[]=new int[n];
		for(int i=0;i<n;i++){
			int temp=Integer.parseInt(arr[i]);
			String[] splitNumber=arr[i].split("");
			for(int k=0;k<arr[i].length();k++){
				int divider=Integer.parseInt(splitNumber[k]);
				if(divider!=0){
					if(temp%divider==0){
						
						count[i]++;
					}
				}
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.println(count[i]);
		}
	}

}
