package com.prave;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsLambda 
{
	public static List <StringBuffer> filterList(List <StringBuffer> l, StringBufferPredicate predicate)
	{
		List <StringBuffer> res=new ArrayList<StringBuffer>();
		
		for(StringBuffer str:l)
		{
			if(predicate.test(str))
				res.add(str);
		}
		return res;
		
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//Program-1
		Average avg = (List <Integer> list) -> { int a=0; for(int element:list) a+=element; return a/list.size(); };
		System.out.println("Enter number of elements in the list");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the list");
		List <Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			list.add(sc.nextInt());
	
		System.out.println("Average of the elements in the list "+avg.average(list));
		
		
		//Program-2
		System.out.println("Enter number of strings in the list");
		int numOfStrings1=sc.nextInt();
		System.out.println("Enter strings of the list");
		List <String> stringlist1=new ArrayList<String>();
		for(int i=0;i<numOfStrings1;i++)
			stringlist1.add(sc.next());
		
		List <String> result1=stringlist1.stream().filter(s->s.startsWith("a") && s.length()==3).collect(Collectors.toList());
		System.out.println("Strings that start with a and of length 3 "+result1);
		
		//Program-3
		System.out.println("Enter number of strings in the list");
		int numOfStrings2=sc.nextInt();
		System.out.println("Enter strings of the list");
		List <StringBuffer> stringlist2=new ArrayList<StringBuffer>();
		for(int i=0;i<numOfStrings2;i++)
			stringlist2.add(new StringBuffer(sc.next()));
		
		List <StringBuffer> result2=StreamsLambda.filterList(stringlist2, Palindrome::isPalindrome);
		System.out.println("List of palindromes in the given strings "+result2);
					
		sc.close();
	}
	
	

}
