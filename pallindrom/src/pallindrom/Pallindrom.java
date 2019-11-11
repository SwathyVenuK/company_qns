package pallindrom;

import java.util.Scanner;

public class Pallindrom {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r;
		int sum=0;
		System.out.println("Enter a number");
		int n=s.nextInt();
		int t=n;
		while(n!=0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
			
		}
		if(sum==t)
		{
			System.out.println("Pallindrom");
		}
		else
		{
			System.out.println(" not Pallindrom");
			
		}
		

	}

}
