package com.him.hackerrank.arrays;

public class NewYearChaos {

	static void minimumBribes(int[] q) {
		boolean isSorted=false;
		int noOfSwaps=0;
		boolean isChaotic=false;
		while(!isSorted && !isChaotic) {
			isSorted=true;
			for(int i=0;i<q.length-1;i++) {
				if(q[i]-(i+1)>2) {
					//System.out.println("Too chaotic");
					isChaotic=true;
					break;
				}
				if(q[i]>q[i+1]) {
					swap(q,i);
					noOfSwaps++;
					isSorted=false;
				}
			}
		}
		if (isChaotic)
			System.out.println("Too chaotic");
		else
			System.out.println(noOfSwaps);
	}
	
	private static void swap(int[] q, int i) {
		int tmp=q[i];
		q[i]=q[i+1];
		q[i+1]=tmp;
		
	}

	/*
	 * static void minimumBribes(int[] q) { int minBribes = 0; boolean isChaotic =
	 * false; for (int i = 0; i < q.length; i++) { int elem=q[i]; int
	 * expectedElem=i+1;
	 * 
	 * if (expectedElem != elem && expectedElem < elem && !isChaotic) { int bribe =
	 * elem-expectedElem; if (bribe > 2) { isChaotic = true; } else { minBribes =
	 * minBribes + bribe; } } } if (isChaotic) System.out.println("Too chaotic");
	 * else System.out.println(minBribes);
	 * 
	 * }
	 */
	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 3, 4 };
		int[] arr1= {2,5,1,3,4};
		//int[] arr2= {1, 2, 5, 3, 7, 8, 6, 4}; // 12345678 -> 12354678,5 -> 12534678,5->12534768,7->12537468,7->12537648,6->12537684,8->12537864,8
		//5=2tr,7=2tr,
		minimumBribes(arr1);
	}

}
