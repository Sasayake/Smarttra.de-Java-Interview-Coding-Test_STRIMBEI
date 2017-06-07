package coding_test_2;

/**
 * This is the Stock class, used to create a collection of Stock objects that will be placed in an ArrayList.
 * 
 * @author Sondra
 *
 */
public class Stock {
	private String name;
	private Double value;
	
	public Stock(String name, Double value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "stock [name=" + name + ", value=" + value + ", getName()=" + getName() + ", getValue()=" + getValue()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
