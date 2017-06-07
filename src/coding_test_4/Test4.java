package coding_test_4;

import java.util.HashMap;
import java.util.Scanner;

/**
 * This class is meant to create a hashmap of stocks were we can add more key values, and then ask in the console for a specific stock's value.
 * 
 * @author Sondra
 *
 */
public class Test4 {

	public static void main(String[] args) {
		// Creation of the hashmap with the given keys and values
		HashMap<String, Double> map = new HashMap<String, Double>(); 
		map.put("Apple", 130.89);
		map.put("Google", 149.23);
		map.put("Samsung", 200.1);
		map.put("GE", 135.01);
		map.put("HP", 300.5);
		
		Scanner sc = new Scanner(System.in);
		
		// Creation of a loop : we can either ask to add elements to the array or display the existing array
		// We can display the array after adding the desired number of stocks.
		Boolean display = false; 
		while (display == false) {
			System.out.println("Do you want to add an element to the hashmap or display the value of an input stock ? Please tell \"add\" or write the name of the stock. ");
			String answer = sc.nextLine();
			
			// First possibility : add a stock
			if (answer.equals("add")) {
				System.out.println("Please give the name of the stock.");
				String new_name = sc.nextLine();
				System.out.println("Please give the value of the stock.");
				Double new_value = sc.nextDouble();
				System.out.println("The new stock is " + new_name + " with a value of " + new_value +"\n");
				// A new stock is created with the input parameters and added to the hashmap
				map.put(new_name, new_value);
	
				sc.nextLine();
			}
			// Second possibility : display the hashmap
			else if (answer.equals("display")) {
				display = true;
			}
		}
		
		System.out.println("Write the name of the stock.");
		String answer = sc.nextLine();
		// We get the value that corresponds to the input key
		Double value = map.get(answer);
		// If the input stock is not on the hashmap, we prefer an error message than a Null value returned
		if (value == null) {
			System.out.print("The stock you mentionned is not in the hashmap.");
		}
		else {
			System.out.println("The value of the stock " + answer + " is " + value);
		}
		sc.nextLine();
            
	}

}
