package pallindrom;

import java.util.Scanner;

public class Pallindrom1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String a=s.nextLine();
		
		int l=a.length();
		int i;
		String sum="";
		for(i=l-1;i>=0;i--)
		{
			sum=sum+a.charAt(i);
	
		}
		
		if(a.equals(sum))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println(" not Pallindrome");
			
		}
	}

}
