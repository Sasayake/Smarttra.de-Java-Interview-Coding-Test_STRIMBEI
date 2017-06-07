package coding_test_1;

/**
 * This class is a simple User class that can be used for accounts on a website for example.
 * 
 * @author Sondra
 *
 */
public class User{
	// giving class User parameters
	String last_name;
	String first_name;
	String login;
	int id;

	// creation of User constructor
	public User(String p_lname, String p_fname, String p_l, int p_id){
	last_name = p_lname;
	first_name = p_fname;
	login = p_l;
	id = p_id;
	}

	// generation of setters and getters
	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}

