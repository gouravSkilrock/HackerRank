package com.practice;

import java.util.Scanner;

public class RunningTimeOfAlgorithm {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("How many no. want to enter");
		int totalNum=sc.nextInt();
		int[] numberArr=new int[totalNum];
		System.out.println("enter nos. now ... ");

		for(int i=0;i<totalNum;i++){
			numberArr[i]=sc.nextInt();
		}

		int count=0;
		for(int k=0;k<totalNum;k++){
			int index=getMinimumNo(k,totalNum, numberArr);
			for(int i=index-1;i>=0;i--){
				if(numberArr[i]>numberArr[index]){
					int temp=numberArr[index];
					numberArr[i+1]=numberArr[i];
					numberArr[i]=temp;
					index=i;
					count++;

				}else{

				}
			}
		}

		System.out.println("Running time is :"+count);
		System.out.print("Sorted Array is :");
		for(int i:numberArr){
			System.out.print(i+" : ");
		}

	}

	private static int getMinimumNo(int initialValue,int n, int[] arr) {
		int index=0;
		int min=arr[initialValue];
		for(int i=initialValue;i<n;i++){
			if(arr[i]<min){
				min=arr[i];
				index=i;

			}
		}
		return index;
	}
}
