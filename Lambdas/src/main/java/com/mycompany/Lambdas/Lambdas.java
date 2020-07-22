package com.mycompany.Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Lambdas 
{
	public int averageIntegers(List<Integer> listIntegers)
	{
		int average = 0;
		
		for(int i=0;i<listIntegers.size();i++)
		{
			average = average + Integer.valueOf(listIntegers.get(i));
		}
		return average/listIntegers.size();
	}
	public List<String> strings(List<String> listStrings)
	{
		List<String> resultStrings = new ArrayList<String>();
		
		Predicate<String> predicate = (string)->string.startsWith("a")&&string.length()==3;
		
		for(String st:listStrings)
			if(predicate.test(st))
				resultStrings.add(st);
		
		return resultStrings;
	}
	public List<String> palindromes(List<String> listPalindromes)
	{
		List<String> result = new ArrayList<String>();
		PalindromeChecker pc = new PalindromeChecker();
		
		for(String st:listPalindromes)
			if(pc.palindromeCheck(PalindromeChecker::isPalindrome, st))
				result.add(st);
		
		return result;
	}
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
        List list; //= new ArrayList();
        while(true)
        {
        	System.out.println("1.Enter Integers\n2.Enter Strings\n3.Enter either Palindromes or non-Palindromes\n4.Exit");
        	int choice = scan.nextInt();
        	switch(choice)
        	{
        	case 1:
        		list = new ArrayList<Integer>();
        		System.out.println("Enter the size of list:");
        		int size = scan.nextInt();
        		System.out.println("Enter "+size+" integers");
        		for(int i=0;i<size;i++)
        		{
        			list.add(scan.nextInt());
        		}
        		System.out.println("Average of List of Integers is:"+new Lambdas().averageIntegers(list));
        		break;
        	case 2:
        		list = new ArrayList<String>();
        		System.out.println("Enter the size of list:");
        	    size = scan.nextInt();
        		System.out.println("Enter "+size+" strings");
        		for(int i=0;i<size;i++)
        		{
        			list.add(scan.next());
        		}
        		System.out.println("String that start with \"a\" and of length 3 are:"+new Lambdas().strings(list));
        		break;
        	case 3:
        		list = new ArrayList<String>();
        		System.out.println("Enter the size of list:");
        	    size = scan.nextInt();
        		System.out.println("Enter "+size+" strings either palindrome or non-palindrome");
        		for(int i=0;i<size;i++)
        		{
        			list.add(scan.next());
        		}
        		System.out.println("Strings that are palindromes:"+new Lambdas().palindromes(list));
        		break;
        	default:System.exit(0);
        	}
        }
    }
}
