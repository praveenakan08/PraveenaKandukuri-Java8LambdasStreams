package com.prave;

public class Palindrome 
{
	public static boolean isPalindrome(StringBuffer str)
	{
		if(str.toString().equals(str.reverse().toString()))
			return true;
		return false;
	}

}
