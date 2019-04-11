package com.him.hackerrank.test.atlasian;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAList {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		List<Integer> list1=getList(scanner);
		List<Integer> list2=getList(scanner);
		
		int index=find(list1,list2);
		System.out.println(index);
		scanner.close();
	}

	private static int find(List<Integer> list1, List<Integer> list2) {
		
		int uncommonElems= list1.size()-list2.size();
		
		for(int i=uncommonElems,j=0;i<list1.size();i++,j++) {
			if(list1.get(i)!=list2.get(j)) {
				return -1;
			}
		}
		
		
		return uncommonElems;
	}

	private static List<Integer> getList(Scanner scanner) {
		int size=scanner.nextInt();
		List<Integer> list=null;
		for(int i=0;i<size;i++) {
			if(list==null) {
				list=new ArrayList<>();
			}
			list.add(scanner.nextInt());
			
		}
		return list;
	}

}
