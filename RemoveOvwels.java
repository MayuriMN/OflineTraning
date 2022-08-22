package offlineTraning;

import java.util.Scanner;

//WAP to remove all the vowels from the given string.

public class RemoveOvwels {

	public static void main(String str[])
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str1 = sc.next();
		
		for(int i=0;i<str1.length();i++) {
		if(str1.charAt(i)=='a'||str1.charAt(i)=='A'
				|| str1.charAt(i)=='i'||str1.charAt(i)=='I'
				|| str1.charAt(i)=='o'||str1.charAt(i)=='O'
				|| str1.charAt(i)=='e'|| str1.charAt(i)=='E'
				|| str1.charAt(i)=='u'|| str1.charAt(i)=='U')
		{
			continue;
		}else {
			System.out.println(str1.charAt(i));
		}
		
	}}
}
