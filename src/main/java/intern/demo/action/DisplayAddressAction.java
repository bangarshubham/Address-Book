package intern.demo.action;

import java.util.ArrayList;
import intern.demo.Address;


/**
 * Description  : This class define the execute method  which is present in Action Interface , so  it implements Action Interface
 * @author      : Shubham Bangar
 * @version 1.0
 */


public class DisplayAddressAction implements Action {

	/** abook is reference of Address ArrayList */
	private ArrayList<Address> abook;
	int index;
	public DisplayAddressAction(ArrayList<Address> Book)
	{
		this.abook = Book;
	}
	
	/**
	 * It is a concrete method which display your Address Book.
	 */
	public void execute()
	{
		
		System.out.println("     Your Address Book    ");
		System.out.printf("index\tStreet\tCity\tPincode\n");
		for(Address ad : abook)
		{
			//System.out.println(abook.indexOf(ad));
			ad.display(abook.indexOf(ad));
		}
		
		System.out.println("------------------------------");
	}
	
}
