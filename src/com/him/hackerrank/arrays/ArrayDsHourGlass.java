package com.him.hackerrank.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrayDsHourGlass {

	 // Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
    	int largestSum = Integer.MIN_VALUE;
    	for(int x=0;x<arr.length-2;x++) {
    		for(int y=0;y<arr[0].length-2;y++) {
    			
    			int sum=getHourGlassSum(x,y,arr);
    			largestSum=sum>largestSum ? sum : largestSum;
    		}
    	}
    	return largestSum;
    }



	private static int getHourGlassSum(int x, int y, int[][] arr) {
		int sum=0;
		for(int a=0;a<3;a++) {
			for(int b=0;b<3;b++) {
				if(a==1 && (b==0||b==2)) {
					continue;
				}
				//System.out.println(a+x+","+(b+y)+":"+arr[a+x][b+y]);
				sum=sum+arr[a+x][b+y];
			}
		}
		return sum;
	}



	//private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
		/*
		 * BufferedWriter bufferedWriter = new BufferedWriter(new
		 * FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * int[][] arr = new int[6][6];
		 * 
		 * for (int i = 0; i < 6; i++) { String[] arrRowItems =
		 * scanner.nextLine().split(" ");
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 * 
		 * for (int j = 0; j < 6; j++) { int arrItem = Integer.parseInt(arrRowItems[j]);
		 * arr[i][j] = arrItem; } }
		 */

    	int[][] arr= {{-1,-1,0,-9,-2,-2},
    			{-2,-1,-6,-8,-2,-5},
    			{-1,-1,-1,-2,-3,-4},
    			{-1,-9,-2,-4,-4,-5},
    			{-7,-3,-3,-2,-9,-9},
    			{-1,-3,-1,-2,-4,-5}};
        int result = hourglassSum(arr);
        System.out.println(result);

		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 * 
		 * scanner.close();
		 */
    }
}
