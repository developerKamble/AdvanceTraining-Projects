package com.coreproject3;
/*Write a program that allows you  to  create an integer array of  18  elements with  the following 
 * values: 
 * int A[] = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0}.
 * Perform the following computations, 
 * a.Compute the sum of elements from index 0 to 14 and stores it at element 15
 * b.Compute the average of all numbers and stores it at element 16 
 * c.Identifies the smallest value from the array and stores it at element 17
 * */
public class MathsOperations {

	public static void main(String[] args) {
		int A[] = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
		 int sum=0,min=A[0];
		for(int i=0;i<15;i++) {
			sum+=A[i];
			if(A[i]<=min) {
				min=A[i];
			}
		}
		A[15]=sum;
		A[17]=min;
		//System.out.println(A[15]);
		A[16]=A[15]/2;
		System.out.println("Given Array :");
		
		for(int i=0;i<18;i++) {
			System.out.print(" "+A[i]+" ");
		}
		

	}

}
