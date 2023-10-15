// Chef wants to implement wildcard pattern matching supporting only the wildcard '?'. The wildcard character '?' can be substituted by any single lower case English letter for matching. 
// He has two strings X and Y of equal length,
// made up of lower case letters and the character '?'. He wants to know whether the strings X and Y can be matched or not.

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input =new Scanner(System.in);
		int t=input.nextInt();
		input.nextLine(); 
		    while(t-->0)
		    {
		        String str1=input.nextLine();
		        String str2=input.nextLine();
		        StringBuilder string1=new StringBuilder(str1);
		        StringBuilder string2=new StringBuilder(str2);
		        
		        for(int i=0;i<str1.length();i++)
		        {
		            if(string1.charAt(i)=='?'&&string2.charAt(i)!='?')
		            {
		            char ch=string2.charAt(i);
		            string1.setCharAt(i,ch);
		            }
		            else if(string1.charAt(i)!='?'&&string2.charAt(i)=='?')
		            {
		             char ch=string1.charAt(i);
		            string2.setCharAt(i,ch);
		            }
		          //  else if(string1.charAt(i)=='?'&&string2.charAt(i)=='?')
		          //  {
		          //      char ch='z';
		          //      string2.setCharAt(i,ch);
		          //      string1.setCharAt(i,ch);
		                
		          //  }
		        }
		        if (string1.toString().equals(string2.toString()))
		        {
		            System.out.println("Yes");
		           // System.out.println(string1);
		            //System.out.println(string2);
		        }
		        else
		        {
		            System.out.println("No");
		            // System.out.println(string2);
		            // System.out.println(string1);
		        }
		    }
	}
}
