package com.him.hackerrank.arrays;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayManipulation {

	static long arrayManipulation(int n, int[][] queries) {
		long max = Long.MIN_VALUE;
		long[] array=new long[n];
		//IntStream.range(0, queries.length).asLongStream().forEach(i->array[i]=0);
		
		for(int i=0;i<queries.length;i++) {
			int startIndex=queries[i][0];
			int endIndex=queries[i][1];
			int elemToAdd=queries[i][2];
			
			for(int j=startIndex-1;j<=endIndex-1;j++) {
				array[j]=array[j]+elemToAdd;
				max=array[j]>max?array[j]:max;
			}
			
		}

		return max;

	}


	
	

	    public static void main(String[] args) throws IOException {
	        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\hmnsh\\Documents\\eclipse workspaces\\workspace1_poc\\Hackerrank\\resources\\array\\ArrayManipulation_TC4.txt"));
	        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\hmnsh\\Documents\\eclipse workspaces\\workspace1_poc\\Hackerrank\\resources\\array\\ArrayManipulation _TC7.txt"));
	        Scanner scanner = new Scanner(br);
	        
	        
	        String[] nm = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nm[0]);

	        int m = Integer.parseInt(nm[1]);

	        int[][] queries = new int[m][3];

	        for (int i = 0; i < m; i++) {
	            String[] queriesRowItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int j = 0; j < 3; j++) {
	                int queriesItem = Integer.parseInt(queriesRowItems[j]);
	                queries[i][j] = queriesItem;
	            }
	        }

	        long result = arrayManipulation(n, queries);
	        System.out.println(result);

	        scanner.close();
	    }


}
