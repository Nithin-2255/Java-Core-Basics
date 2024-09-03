package Numword;

import java.util.Scanner;

public class numberinWord 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num>=0&&num<10)
		{
			ones(num);
		}
		else if(num>10&&num<20)
		{
			twos(num);
		}
		else if(num>=20&&num<=99)
		{	
			int d=num-num%10;
			if(d>=20&&d<=90)
			{
				twodi(d);
				System.out.print(" ");
			}
			int r=num%10;
			if(r>=0&&r<=9)
			{
				ones(r);
			}
		}
		else if (num>=99&&num<=999)
		{
			int d=num-num%100;
			if(d>=100&&d<=900)
			{
				three(d);
				System.out.print(" " +"and");
			}
			int r=num%100;
			int twoo=r-r%10;
			if(twoo>=20&&twoo<=90)
			{
				System.out.print(" ");
				twodi(twoo);
			}
			int on=r%10;
			if(on>=0&&on<=9)
			{
				System.out.print(" ");
				ones(on);
			}
		}
			
	}
	static void ones(int num)
	{
		if(num==1)
		{
			System.out.print("one");
		}
		else if(num==2)
		{
			System.out.print("two");
		}
		else if(num==3)
		{
			System.out.print("three");
		}
		else if(num==4)
		{
			System.out.print("four");
		}
		else if(num==5)
		{
			System.out.print("five");
		}
		else if(num==6)
		{
			System.out.print("six");
		}
		else if(num==7)
		{
			System.out.print("seven");
		}
		else if(num==8)
		{
			System.out.print("eight");
		}
		else if(num==9)
		{
			System.out.print("nine");
		}
		else if(num==10)
		{
			System.out.print("ten");
		}
	}
	static void twos(int num)
	{
		if(num==11)
		{
			System.out.print("eleven");
		}
		else if(num==12)
		{
			System.out.print("twelve");
		}
		else if(num==13)
		{
			System.out.print("thirteen");
		}
		else if(num==14)
		{
			System.out.print("fourteen");
		}
		else if(num==15)
		{
			System.out.print("fifteen");
		}
		else if(num==16)
		{
			System.out.print("siteen");
		}
		else if(num==17)
		{
			System.out.print("seventeen");
		}
		else if(num==18)
		{
			System.out.print("eighteen");
		}
		else if(num==19)
		{
			System.out.print("ninteen");
		}
	}
	static void twodi(int num)
	{
		if(num==20)
		{
			System.out.print("twenty");
		}
		else if(num==30)
		{
			System.out.print("thirty");
		}
		else if(num==40)
		{
			System.out.print("fourty");
		}
		else if(num==50)
		{
			System.out.print("fifty");
		}
		else if(num==60)
		{
			System.out.print("sixty");
		}
		else if(num==70)
		{
			System.out.print("seventy");
		}
		else if(num==80)
		{
			System.out.print("eighty");
		}
		else if (num==90)
		{
			System.out.print("ninety");
		}	
	}
	static void three(int num)
	{
		if(num==100)
		{
			System.out.print("onehundred");
		}
		else if(num==200)
		{
			System.out.print("twohundred");
		}
		else if(num==300)
		{
			System.out.print("threehundred");
		}
		else if(num==400)
		{
			System.out.print("fourhundred");
		}
		else if(num==500)
		{
			System.out.print("fivehundred");
		}
		else if(num==600)
		{
			System.out.print("sixhundred");
		}
		else if(num==700)
		{
			System.out.print("sevenhundred");
		}
		else if(num==800)
		{
			System.out.print("eighthundre");
		}
		else if(num==900)
		{
			System.out.print("ninehundred");
		}
 }
}

