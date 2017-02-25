package com.practice;

import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        long a = in.nextLong();
	        long b = in.nextLong();
	        long c = in.nextLong();
	        long d = in.nextLong();
	        long e = in.nextLong();
	        long[] sumArr=new long[5];
	        for(int i=0;i<5;i++){
	        	switch (i) {
				case 0:sumArr[i]=a+b+c+d;
				break;
				case 1:sumArr[i]=b+c+d+e;
				break;
				case 2:sumArr[i]=a+c+d+e;
				break;
				case 3:sumArr[i]=a+b+d+e;
				break;
				case 4:sumArr[i]=a+b+c+e;
				break;
				default:System.out.println("Wrong input !!!");
					break;
				}
	        }
          long min=sumArr[0],max=sumArr[0];
          for(int i=0;i<5;i++){
        	  if(min>sumArr[i]){
        		  min=sumArr[i];
        	  }
          }
          for(int i=0;i<5;i++){
        	  if(max<sumArr[i]){
        		  max=sumArr[i];
        	  }
          }
          System.out.println(min+" "+max);

	}

}
