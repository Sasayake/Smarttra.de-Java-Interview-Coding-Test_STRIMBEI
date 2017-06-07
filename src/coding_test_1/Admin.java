package coding_test_1;

/**
 * This class Admin in an inheritance of the User class. 
 * It has an additional password parameter to grant more rights.
 * 
 * @author Sondra
 *
 */
public class Admin extends User{
	
	String password;

	public Admin(String p_lname, String p_fname, String p_l, int p_id, String password) {
		super(p_lname, p_fname, p_l, p_id);
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
