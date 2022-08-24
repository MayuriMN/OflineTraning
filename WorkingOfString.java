package offlineTraning;

public class WorkingOfString {

	public static void main(String args[])
	{
		String s1 = "mayuri";
		String s2 = "mayuri";
		
		System.out.println("S1 Hashcode :" +s1.hashCode());
		System.out.println("S2 Hashcode :" +s2.hashCode());
		
		System.out.println(s1==s2);//pointing to same memory area thats why it true means both s1 and s2 are stored in scp
		System.out.println(s1.equals(s2));//value that is mayuri is same in both the object
		System.out.println(s1.compareTo(s2));
		
		String s3 = new String("Emp");//pointing to different memory area thats why it false
		String s4 = new String("Emp");
		//when we create string by using new operator at that time two objects are created one created in heap and second in pool
		
		
		System.out.println("\n"+"S3 Hashcode :" +s3.hashCode());//pointing to the different memory location
		System.out.println("S4 Hashcode :" +s4.hashCode());
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.compareTo(s4));
		
		String s5 = "java";
		String s6 = new String("java");
		
		System.out.println("\n"+"S5 Hashcode :" +s5.hashCode());
		System.out.println("S6 Hashcode :" +s6.hashCode());
		
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		System.out.println(s5.compareTo(s6));
		
		// s1 > s2, it returns positive number  
		// s1 < s2, it returns negative number  
		// s1 == s2, it returns 0  
		
	}
	
}
