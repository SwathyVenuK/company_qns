package pallindrom;

import java.util.Scanner;

public class Secondlargest {
//second largest num in an array
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("num of elements");
	int n=s.nextInt();

	int a[]=new int[n];
	int i,j;
	int t=0;
	System.out.println("enter the elements");
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-1;j++)
		{
			if(a[j]>a[j+1])
			{
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
				
				
				
				
			}
		}
	
		
	}
	System.out.print(a[n-2]);
	}
}
