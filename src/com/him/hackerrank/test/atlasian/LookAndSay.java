package com.him.hackerrank.test.atlasian;

import java.util.Scanner;

public class LookAndSay {
	
	private static String lookAndSay(String numStr) {
		char curr;
		int countOfCUrrChar=0;
		String res="";
		char prevChar = 0;
		for(int i=0;i<numStr.length();i++) {
			curr=numStr.charAt(i);
			if(curr==prevChar) {
				countOfCUrrChar++;
			}else {
				if(countOfCUrrChar>0) {
					res=res+Integer.toString(countOfCUrrChar)+prevChar;
					countOfCUrrChar=1;
				}else {
					countOfCUrrChar++;
				}
			}
			if(i==numStr.length()-1) {
				res=res+Integer.toString(countOfCUrrChar)+curr;
			}
			prevChar=curr;
		}
		
		
		return res;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String start=scanner.nextLine().trim();
		int n=scanner.nextInt();
		String res=getNthLookup(start,n);
		System.out.println(res);
		scanner.close();
	}
	private static String getNthLookup(String start, int n) {
		String prevRes=start;
		for(int i=0;i<n;i++) {
			prevRes=lookAndSay(prevRes);
		}
		return prevRes;
	}

}
