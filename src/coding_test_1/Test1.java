package coding_test_1;

/**
 * This class is testing that we can use a User method on a Admin instance, thanks to inheritance.
 * 
 * @author Sondra
 *
 */
public class Test1 {
	
	public static void main(String[] args) {
		Admin admin1 = new Admin("Strimbei", "Sondra", "sasayake", 1, "azerty");
		// We ask to print the admin's last name thanks to a User getter, which is possible thanks to inheritance.
		System.out.println(admin1.getLast_name()+"\n");
	}
	
}
