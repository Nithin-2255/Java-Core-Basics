package Capsule;

import java.util.Scanner;

public class Info 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter name");
		String name=sc.nextLine();
		System.out.println("enter age");
		int age=sc.nextInt();
		personalInfo ab=new personalInfo();
		System.out.println(ab.getName());
		
	}
}
