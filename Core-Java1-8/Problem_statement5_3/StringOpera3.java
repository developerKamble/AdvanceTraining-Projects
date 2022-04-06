package com.coreproject3;
/*5.3 Take a string from  user. Remove first char and  add  it at the end  and  print  the string. 
 * Repeat process for number of times equal to length of string. 
 * For example, if string is "MPHASIS", output should be:Example 
 * 1: Input:  “MPHASIS”
 * Output: Then output should be: MPHASIS 
 *                                PHASISM 
 *                                HASISMP
 *                                ASISMPH
 *                                SISMPHA
 *                                ISMPHAS
 *                                SMPHASI
 *                                MPHASIS
 * */
public class StringOpera3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "MPHASIS",nstr="";
		char ch; 
		System.out.println(str);
		StringBuilder sb=new StringBuilder(str);
		for (int i=0; i<str.length(); i++)
		      {
					ch = sb.charAt(0);
					sb.deleteCharAt(0); // extracts each character
					sb = sb.append(ch); // adds each character in front of the existing string
					System.out.println(sb);
				}
			

	}

}
