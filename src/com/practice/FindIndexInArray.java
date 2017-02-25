package com.practice;

import java.util.Scanner;

public class FindIndexInArray {

	public static void main(String[] args) {
		
		
		Scanner in =new Scanner(System.in);
		int ele=in.nextInt();
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			if(ele==arr[i]){
				System.out.println(i);
				break;
			}
		}

	}

}
