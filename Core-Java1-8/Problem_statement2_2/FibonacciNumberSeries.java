package com.coreproject2;

/* Write a program that accepts two numbers from the Command Line and print them out. 
 * Then use a for loop  to print the next 13 numbers in the sequence where each number is the sum
 * of the previous two.
 */
public class FibonacciNumberSeries {

	 public static void main(String[] args) {
			
			int[] arr = new int[15];
			int j=0;
			 if (args.length > 0) {
				 for(String val:args) {
					arr[j]=Integer.parseInt(val);
					j++;
				 }
				 for(int i=0;i<13;i++) {
					 arr[i+2]=arr[i]+arr[i+1];
				 }System.out.print("Numbers in series : ");
	             for(int i=0;i<15;i++) {
				 System.out.print(arr[i]+"  ");
	             }
			 }else
				 System.out.println("No command line arguments found.");
		}
}
