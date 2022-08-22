package offlineTraning;

import java.util.Scanner;

/*1) Create a program in which two string is input by the user and after that user will enter index in 
first string where we want to insert the second string and insert the second string at that index 
and create a new string */

public class StringF1 {
	
	

		
			// Function to insert string
			public static String insertString(String ostr,String instr,int index)
			{

				// Create a new string
				String newString = new String();

				for (int i = 0; i <ostr.length(); i++) {

					// Insert the original string character
					// into the new string
					newString += ostr.charAt(i);

					if (i == index) {

						// Insert the string to be inserted
						// into the new string
						newString += instr;
					}
				}

				// return the modified String
				return newString;
			}

			// Driver code
			 public static void main(String arg[])
			 {
				 Scanner sc = new Scanner(System.in);
				 System.out.println("Enter any string");
				 String ostr = sc.next();
				 String instr = sc.next();
				 int index = sc.nextInt();
				 
				 System.out.println("Frist String is "+ostr);
				 System.out.println("Second String is "+instr);
				 
				// System.out.println(str.substring(0, 2)+instr);
								

				// Insert the String
				System.out.println("Modified String: "
								+ insertString(ostr,instr,index));
			}
		

		 
	 }
	


