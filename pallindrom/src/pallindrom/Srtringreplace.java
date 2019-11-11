package pallindrom;

import java.util.Scanner;

public class Srtringreplace {

	public static void main(String[] args) {
		   Scanner s=new Scanner(System.in);
		    //replace vowel value in the array 
		      //INPUT
		      System.out.println("enter the String");
		      String a=s.next();
		      System.out.println("which word you want to replace");
		      char c=s.next().charAt(0);
		      //FINDING LENGTH
		      int l=a.length();
		      int i=0;
		      char ch[]=new char[l];
		      //CHECKING

		      for(i=0;i<l;i++)
		      {
		    	ch[i]=a.charAt(i);
		    	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')	
		    	{
		    		ch[i]=c;	
		    	}
		      }
		    //PRINTING
		      
		      System.out.println("New string is");
		      for(i=0;i<l;i++)
		      {
		      System.out.print(ch[i]);
			}

		}}


