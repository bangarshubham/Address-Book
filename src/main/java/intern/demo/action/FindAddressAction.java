package intern.demo.action;

import java.util.ArrayList;
import java.util.Scanner;
import intern.demo.Address;
//import intern.demo.Menu;

/**
 * Description : This class define the execute method which is present in Action
 * Interface , so it implements Action Interface
 * 
 * @author : Shubham Bangar
 * @version 1.0
 */

public class FindAddressAction implements Action {

	/** abook is reference of Address ArrayList */
	private ArrayList<Address> abook;
	private String findBy;
	Scanner sobj = new Scanner(System.in);
	// private Menu Menu;

	public FindAddressAction(ArrayList<Address> Book, String by) {
		this.abook = Book;
		this.findBy = by;
	}

	/**
	 * It is a concrete method which is to find Address using MenuItem class
	 * characteristics , only user have to give choice so corresponding action gets
	 * executed.
	 */
	public void execute() {

		if (this.findBy == "Street") {
			findByStreet();
		} else if (this.findBy == "City") {
			findByCity();
		} else if (this.findBy == "Pincode") {
			findByPincode();
		}
	}

	/**
	 * This method accept String street from user and find corresponding Address from Address Book.
	 * It display failure if given street not present in the Address Book 
	 */
	public void findByStreet() {
		int flag = 0;
		System.out.println("Enter street to search :");
		String str = sobj.nextLine();

		for (Address ad : abook) {
			if (ad.isMatchStreet(str)) {
				ad.display();
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(str + " " + "street not found in the Address Book");
		}

	}

	/**
	 * This method accept String city from user and find corresponding Address from Address Book.
	 * It display failure if given city not present in the Address Book 
	 */
	public void findByCity() {
		int flag = 0;
		System.out.println("Enter City to search :");
		String str = sobj.nextLine();
		for (Address ad : abook) {
			if (ad.isMatchCity(str)) {
				ad.display();
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.println(str + " " + "city not found in the Address Book");
		}

	}

	/**
	 * This method accept integer pincode from user and find corresponding Address from Address Book.
	 * It display failure if given pincode not present in the Address Book 
	 */
	private void findByPincode() {
		int flag = 0;
		System.out.println("Enter pincode to search:");
		int pincode = sobj.nextInt();

		for (Address ad : abook) {
			if (ad.isMatchPincode(pincode)) {
				ad.display();
				flag = 1;
				break;
			}

		}
		if (flag == 0) {
			System.out.println(pincode + " " + "pincode not found in the Address Book");
		}

	}
}
