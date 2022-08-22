package offlineTraning;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//WAP to print the number of alphabets repeated in the given string.

public class RepeatedAlphabets {

	public static void main(String args[])
	{
		String str="aahkkpyy";
		
		char a[] = str.toCharArray();
		
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		int value=0;
	   for(int i=0;i<a.length;i++)
	   {
		   if(mp.containsKey(a[i]))
		   {
			   value = mp.get(a[i]);
			   value=value+1;
			   mp.put(a[i],value);
		   }else {
			   mp.put(a[i], 1);
		   }
	   }
		
		System.out.println(mp);
	}
	
}
