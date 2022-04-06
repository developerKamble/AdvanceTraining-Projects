package com.coreproject2;
/*5.2Write an expression parser using split method. Take mathematical expression on command line and try printing each token separately.
 * Example 1: Input: “23  +      45   -(   343   /   12  )”
 * Output: Then output should be:23+45-(343/12)
 * Note:that tokens may be separated by any number of spaces or tabs and operands may contain any number of digits or alphabets*/
public class StringOpera2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="23  +      45   -(   343   /   12  )";
		String spaces = "[ ]+";
		String arr[]=str.split(spaces);
		for(String st:arr) {
			System.out.println(st);

		}
	}

}
