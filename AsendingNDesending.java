package offlineTraning;

import java.util.Scanner;
//WAP to print the all alphabets of string in ascending and descending order
public class AsendingNDesending {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Strings");
		String str = sc.next();
		
		char s[] = str.toCharArray();
		
		char temp;
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				if(s[j]>s[i])
				{
				temp =s[i];
				s[i]=s[j];
				s[j]=temp;
			}
		}
	
		}
	System.out.println("Asending Order: " +new String(s));


	for(int j=0;j<s.length;j++)
	{
		for(int i=0;i<s.length;i++)
		{
			if(s[j]>s[i])
			{
				temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
		}
	}
	System.out.println("Desending Order: " +new String(s));
	}
}