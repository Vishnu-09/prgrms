package com.basicvishnu;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		
		int i,n,flag=0;
			System.out.println("enter the number");
			Scanner ip=new Scanner(System.in);
			n=ip.nextInt();
			for(i=2;i<n;i++)
			{
				if(n%i==0)
				{
					flag=1;
					break;
				}
				}
if(flag==1)
{
	System.out.println("not a prime number");
}
else
{
	System.out.println("it is a prime");
	
}
}
}