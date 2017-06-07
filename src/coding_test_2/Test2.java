package coding_test_2;

import java.util.*;

/**
 * This class is enabling to get an array of companies and their values, you can add companies.
 * The array will be sorted in ascending order.
 * 
 * @author Sondra
 *
 */
public class Test2 {

	public static void main(String[] args) {
		
		// Initialization of the stocks and their values
		Stock Apple = new Stock("Apple",130.89);
		Stock Google = new Stock("Google",149.23);
		Stock Samsung = new Stock("Samsung", 200.1);
		Stock GE = new Stock("GE", 135.01);
		Stock HP = new Stock ("HP", 300.5);
		
		// The stocks are put in an ArrayList
		List<Stock> tab = new ArrayList<Stock>(); 
		tab.add(Apple);
		tab.add(Google);
		tab.add(Samsung);
		tab.add(GE);
		tab.add(HP);
		
		Scanner sc = new Scanner(System.in);
		
		// Creation of a loop : we can either ask to add elements to the array or display the existing array
		// We can display the array after adding the desired number of stocks.
		Boolean display = false; 
		while (display == false) {
			System.out.println("Do you want to add an element to the array or display it ? Please tell \"add\" or \"display\" ");
			String answer = sc.nextLine();
			
			// First possibility : add a stock
			if (answer.equals("add")) {
				System.out.println("Please give the name of the stock.");
				String new_name = sc.nextLine();
				System.out.println("Please give the value of the stock.");
				Double new_value = sc.nextDouble();
				System.out.println("The new stock is " + new_name + " with a value of " + new_value +"\n");
			
				// A new stock is created with the input parameters and added to the ArrayList
				Stock new_stock = new Stock (new_name, new_value);
				tab.add(new_stock);
				
				sc.nextLine();
			}
			
			// Second possibility : display the Array
			else if (answer.equals("display")) {
				display = true;
			}
		}
		
		// We need the size of the array in order to iterate inside and print each line
		int s2 = tab.size();
		// Modification of the existing comparator
		Collections.sort(tab, new Comparator<Stock>() {
		    @Override
		    public int compare(Stock c1, Stock c2) {
		        return c1.getValue().compareTo(c2.getValue());
		    }
		});
		// Iteration inside the array to print each line
		for (int i = 0; i < s2; i++) {
		System.out.println(tab.get(i).getName() + "  " + tab.get(i).getValue());
		}
	}	

}
