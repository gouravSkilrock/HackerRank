package com.practice;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorial {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=in.nextInt();
		
		BigInteger factorial=new BigInteger("1");
		for(int i=n;i>=2;i--){
			
			factorial=factorial.multiply(BigInteger.valueOf(i));
		}
		System.out.println(factorial);

	}

}
