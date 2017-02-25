package com.practice;

import java.util.Scanner;

public class CryotoPerm {

		public static void main(String[] args) {
			String mainString="";
			String mainStringArr[]=new String[26];
			Scanner sc =new Scanner(System.in);
			System.out.println("how many vrypto perm you want");
			int n=sc.nextInt();
			
			
			for(int i=0;i<n;i++){
				System.out.println("Enter a First string !!!");
				String  firstString = sc.next() ;
				String[]  firstStringArr=firstString.split("");
				System.out.println("Enter a Second string !!!");
				String secondString =sc.next();
				String[]  secondStringArr=secondString.split("");
				
				//building a-z character string
				if(firstString.length()==secondString.length()){
					for(Character ch='a';ch<='z';ch++){
						mainString+=""+ch;
					}
					mainStringArr=mainString.split("");
					
					//Building main string
					for(int k=0;k<firstString.length();k++){
						for(int j=0;j<mainString.length();j++){
							if(firstStringArr[k]==mainStringArr[j]){
								mainStringArr[j]=secondStringArr[k];
								break;
							}
						}
						
					}
			
					
				}else{
					System.out.println("String are not equal. Restart code again  !!!");
				}
			}
			
	}
}
