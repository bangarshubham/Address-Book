package intern.demo.action;

import java.util.ArrayList;
import intern.demo.Address;


/**
 * Description  : This class define the execute method  which is present in Action Interface , so  it implements Action Interface
 * @author      : Shubham Bangar
 * @version 1.0
 */

public class ExitAddressAction implements Action {

	public ExitAddressAction(ArrayList<Address> Book) {
	
	}
	
	/**
	 * It is a concrete method which is used to closed your Address Book.
	 */
	public void execute() {
		System.out.println("Address Book closed .......!");
		System.exit(0);
	}

}
