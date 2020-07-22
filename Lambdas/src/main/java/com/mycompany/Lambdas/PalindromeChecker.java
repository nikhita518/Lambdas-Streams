package com.mycompany.Lambdas;

public class PalindromeChecker {
	
	public boolean palindromeCheck(Palindrome p,String s)
	{
		return p.check(s);
	}
	public static boolean isPalindrome(String s)
	{
		StringBuilder stb = new StringBuilder();
		stb.append(s);
		stb = stb.reverse();
		
		if(s.equals(String.valueOf(stb)))
		{
			return true;
		}
		else
			return false;
	}
}
