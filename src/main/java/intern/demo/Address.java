package intern.demo;

/**
 * Description : The Address class used to display All details of Address Book.
 * 
 * @author : Shubham Bangar
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

	/**
	 * Description : This method is used to display the content of Address Book with
	 * its index.
	 * 
	 * @param i : This is the integer parameter display method. It shows index of
	 *          specific content of Address Book.
	 */
	public void display(int i) {

		System.out.printf(i + "\t" + street + "\t" + city + "\t" + pinCode + "\n");
	}

	/**
	 * Description : This is method is used to display the contents of Address Book.
	 */
	public void display() {
		System.out.printf(street + "\t" + city + "\t" + pinCode + "\n");
	}

	/**
	 * Description : This method is used to check whether two strings are equals.
	 * 
	 * @param str : This is the string parameter to isMatchStreet method and it is
	 *            used to check given street is equal to this street.
	 * @return : boolean value i.e true or false.
	 */
	public boolean isMatchStreet(String str) {
		return this.street.contains(str);
	}

	/**
	 * Description : This method is used to check whether two strings are equals.
	 * 
	 * @param str : This is the string parameter to isMatchCity method and it is
	 *            used to check given city is equal to this city.
	 * @return : boolean value i.e true or false.
	 */
	public boolean isMatchCity(String str) {
		return this.city.contains(str);

	}

	/**
	 * Description : This method is used to check whether two integers are equals.
	 * 
	 * @param pincode : This is the interger parameter to isMatchPincode method and
	 *                it is used to check given pincode is equal to this pinocde.
	 * @return : boolean value i.e true or false.
	 */
	public boolean isMatchPincode(int pincode) {
		return (this.pinCode == pincode);
	}

}
