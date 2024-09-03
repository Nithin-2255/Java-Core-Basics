package stringdemo;

import java.util.Scanner;

public class toUPpper
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String word=sc.nextLine();
			String upper="";
			for (int i = 0; i < word.length(); i++) 
			{
	            char a= word.charAt(i);
	            
	            if (Character.isLowerCase(a)) {
	                a = Character.toUpperCase(a);
	            }
	            
	            upper+= a;
	        }
	        
	        System.out.println("new Srtring is  " + upper);
	    }

	}
