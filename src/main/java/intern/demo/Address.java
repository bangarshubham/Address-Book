package intern.demo;

/**
 * Description : The Address class used to display All details of Address Book.
 * @author 	   : Shubham Bangar
 * @version 1.0
 */

public class Address {

	private String street, city;
	private int pinCode;

	public Address(String street, String city, int pinCode) {

		this.street = street;
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public void display(int i) {

		System.out.printf(i + "\t" + street + "\t" + city + "\t" + pinCode + "\n");
	}

	public void display() {
		System.out.printf(street + "\t" + city + "\t" + pinCode + "\n");
	}

	/**
	 * Description : This method is used to check whether two strings are equals.
	 * @param str  : This is the parameter to isMatchStreet method.
	 * @return     : boolean value i.e true or false.
	 */
	public boolean isMatchStreet(String str) {
		return this.street.contains(str);
	}

	/**
	 * Description : This method is used to check whether two strings are equals.
	 * @param str  : This is the parameter to isMatchCity method.
	 * @return     : boolean value i.e true or false.
	 */
	public boolean isMatchCity(String str) {
		return this.city.contains(str);

	}

	/**
	 * Description    : This method is used to check whether two integers are equals.
	 * @param pincode : This is the parameter to isMatchPincode method.
	 * @return		  : boolean value i.e true or false.	
	 */
	public boolean isMatchPincode(int pincode) {
		return (this.pinCode == pincode);
	}

}
