package intern.demo.action;

import java.util.ArrayList;
import java.util.Scanner;
import intern.demo.Address;

/**
 * Description  : This class define the execute method  which is present in Action Interface , so  it implements Action Interface
 * @author      : Shubham Bangar
 * @version 1.0
 */

public class DeleteAddressAction implements Action {

	/** abook is reference of Address ArrayList */
	private ArrayList<Address> abook;
	private int index;
	
	public DeleteAddressAction(ArrayList<Address> Book)
	{
		this.abook = Book;
	}
	
	Scanner sobj = new Scanner(System.in);
	
	/**
	 * It is a concrete method which accept index to delete the Address from Address Book.
	 */
	public void execute()

	{
		System.out.println("Enter index to delete the Address Book :");
		
		index = sobj.nextInt();
		
		abook.remove(index);
		
		System.out.println("Address Book Deleted Successfully !");
		System.out.println("---------------------------------------------");
	}
	
	
}
