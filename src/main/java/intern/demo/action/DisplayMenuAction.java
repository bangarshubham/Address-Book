package intern.demo.action;

import intern.demo.Menu;

/**
 * Description  : This class define the execute method  which is present in Action Interface , so  it implements Action Interface
 * @author      : Shubham Bangar
 * @version 1.0
 */

public class DisplayMenuAction implements Action {
	
	
	private Menu menu;
	
	public DisplayMenuAction(Menu menu) {
		this.menu = menu;
	}

	/** It is a reference of Menu class which is used to display Menu */
	public void execute() {
		menu.display();
	}

}
