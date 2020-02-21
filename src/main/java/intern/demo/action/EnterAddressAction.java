package intern.demo.action;

import java.util.ArrayList;
import java.util.Scanner;
import intern.demo.Address;

/**
 * Description  : This class define the execute method  which is present in Action Interface , so  it implements Action Interface
 * @author      : Shubham Bangar
 * @version 1.0
 */

public class EnterAddressAction implements Action {

	/** abook is reference of Address ArrayList */
	private ArrayList<Address> abook;

	Scanner sobj = new Scanner(System.in);

	public EnterAddressAction(ArrayList<Address> Book) {
		abook = Book;
	}

	/**
	 * It is a concrete method which accept the all Address book characteristics and add them to Address ArrayList.
	 */
	public void execute() {

		System.out.println("Enter Street Address :");
		String street = sobj.next();
		
		System.out.println("Enter City Address :");
		String city = sobj.next();
		
		System.out.println("Enter Pincode Addrees :");
		int pin = sobj.nextInt();
		
		Address ad = new Address(street, city, pin);

		abook.add(ad);
		
		System.out.println("Address Book Added Succesfully !");
		System.out.println("----------------------------------------");
	}

}






//Console c = System.console();
//
//c.printf("Enter address street");
//String street = c.readLine();
//
//c.printf("Enter address city");
//String city = c.readLine();
//
//c.printf("Enter address pincode");
//int pin = Integer.parseInt(c.readLine());