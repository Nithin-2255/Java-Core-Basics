package Numberswith2;

import java.util.Scanner;
import java.util.ArrayList;

public class numbersWIth2 
{
	
	
	        // Step 1: Create an ArrayList
	        ArrayList<String> stringList = new ArrayList<>()
	        
	        // Create a Scanner object for user input
	     Scanner sc=new Scanner(System.in);

	        // Dynamic addition of strings
	        while (true) {
	            System.out.println("Enter a string to add to the list (or type 'exit' to finish):");
	            String input = sc.nextLine();
	            
	            // Exit the loop if the user types 'exit'
	            if ("exit".equalsIgnoreCase(input)) {
	                break;
	            }
	            
	            // Add the string to the ArrayList
	            stringList.add(input);
	        }

	        // Close the scanner
	        scanner.close();

	        // Display the contents of the ArrayList
	        System.out.println("Contents of the ArrayList:");
	        for (String str : stringList) {
	            System.out.println(str);
	        }
	    }
	}
