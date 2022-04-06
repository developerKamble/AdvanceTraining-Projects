package com.coreproject1;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;

/* 1.1Write a program to list all, even numbers less than or equal to the number n. 
 * Take the value of n as input from the user.
 */
import java.util.Scanner;

public class EvenOrLessNumber {
	public static List<Integer> findEvenOrLessNumbers(int n){
		List<Integer> list=new ArrayList<Integer>();
		for(int i=2;i<=n;i++) {
			if(i%2==0 && i<=n) {
				list.add(i);
			}
		}
		//System.out.println(list);
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		List<Integer> arr=findEvenOrLessNumbers(n);
		System.out.println(arr);

	}

}
