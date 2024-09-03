package TImes;

import java.util.Scanner;

public class numberofTimes
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char  store []=new char [20];
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			char a=str.charAt(i);
			store[i] =a;
		}
		count++;
		for (int i = 0; i < store.length; i++) {
            if (store[i] > 0) {
                System.out.println("Character " + str.charAt(i) + " occurs " + count + " times.");
            }
        }

	}
}
