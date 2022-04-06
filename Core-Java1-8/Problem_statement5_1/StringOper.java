package com.coreproject1;

/*5.1Manipulate the String str = “JAVA is Simple” asgiven below.
 * Then output should be as follows:
 * a.JAVA IS SIMPLE      Hint:[replace(), toUpperCase()]
 * b.java is simple      Hint:[replace(), toLowerCase()]
 * c.J i S               Hint:[split(), charAt(0)]
 * d.Simple is JAVA      Hint:[split()]
 * e.AVAJ si elpmiS      Hint:[split(), StringBuilder.reverse()]
 * f.Total length is: 12 Hint:[length()]*/
public class StringOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="JAVA is Simple",nstr="";
		char ch;
		 
		System.out.println(str.replace(" "," ").toUpperCase());
		System.out.println(str.replace(" "," ").toLowerCase());
		String str1[]=str.split(" ");
		for(String st:str1) {
			System.out.print(st.charAt(0)+" ");
		}
		System.out.println();
		
		for(int i=str1.length-1;i>=0;i--) {
			System.out.print(str1[i]+"  ");
		}
		System.out.println();
		
		
		for(String st:str1) {
			
			StringBuilder sb=new StringBuilder(st);  
		    System.out.print(sb.reverse()+" "); 
			
		}
		System.out.println();
		System.out.println("Total length is: "+str.replace(" ","").length());

	}

}