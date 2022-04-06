package com.coreproject1;
/*
 * 1Write a program that takes a String through Command Line argument and display the length 
 * of the string. 
 * Also display  the string into  uppercase and  check whether it is a  palindrome  or not. 
 * (Refer Java API Documentation)
 * */
public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int len=args.length;
		
		if (args.length > 0) {
			System.out.println("length of string :"+args.length );
           // System.out.println("The command line arguments in uppercase :"+args.toString().toUpperCase());
            
            
  
            for (String val : args)
                System.out.println(val);
        }
        else
            System.out.println("No command line "
                               + "arguments found.");
	}

}
