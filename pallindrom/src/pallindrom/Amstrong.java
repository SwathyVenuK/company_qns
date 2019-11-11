package pallindrom;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		int n=s.nextInt();
		int b=n;
		int c=n;
		int r;
		int co=0;
		double sum=0;
		while(c!=0)
		{
			co++;
			c=c/10;
		}
		while(n!=0)
		{
			r=n%10;
			sum=sum+Math.pow(r,co);
			n=n/10;
		}
		if(sum==b)
		{
			System.out.println("Amstrong");
			
			}
		else
		{
			System.out.println(" not Amstrong");
		}
           
	}

}
