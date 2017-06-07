package coding_test_3;

import java.util.*;
import java.util.Map.Entry;

/**
 * This class is meant to create a hashmap of stocks were we can add more key values, and the
 * find the lowest and highest value.
 * 
 * @author Sondra
 *
 */
public class Test3 {

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
			System.out.println("Do you want to add an element to the hashmap or display the lowest and highest values ? Please tell \"add\" or \"display\" ");
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
		
		// Research of the highest and lowest values
		Double maxValueInMap=(Collections.max(map.values()));
		Double minValueInMap=(Collections.min(map.values()));
		for (Entry<String, Double> entry : map.entrySet()) { 
            if (entry.getValue()==maxValueInMap) {  // if the value equals the max value we keep that key
                System.out.println("The highest value is " +entry.getValue()+ " (" +entry.getKey()+ ") "); 
            }
            if (entry.getValue()==minValueInMap) { // if the value equals the min value we keep that key
				System.out.println("The lowest value is " +entry.getValue()+ " (" +entry.getKey()+ ") ");
			}
        } 
		
	}

}
