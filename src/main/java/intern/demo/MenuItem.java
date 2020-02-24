package intern.demo;

import intern.demo.action.Action;

/**
 * Description : The MenuItem class is the base class which provide all
 * functionality to Menu class which is responsible for display menu item. It
 * contains all getter and setter method so that Menu class can accsess private
 * characterstics of MenuItem class.
 * 
 * @author : Shubham Bangar
 * @version 1.0
 */

public class MenuItem {

	private int choice;
	private String DisplayText;
	private Action action;
	private Menu parent;

	public MenuItem(String displayText) {
		setDisplayText(displayText);
	}

	public MenuItem(int choice, String displayText, Action act) {
		super();
		this.choice = choice;
		this.DisplayText = displayText;
		this.action = act;
	}

	public MenuItem(int choice2, String menu) {
		this.choice = choice2;
		this.DisplayText = menu;
	}

	public MenuItem() {
		// TODO Auto-generated constructor stub
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public String getDisplayText() {
		return DisplayText;
	}

	public void setDisplayText(String displayText) {
		DisplayText = displayText;
	}

	/**
	 * This method display menu items.
	 */
	public void display() {
		System.out.println(choice + " : " + DisplayText);

	}

	/**
	 * Description : This method accept the one choice and performs corresponding
	 * action.
	 * 
	 * @param option : This is integer parameter to isSelected method .
	 * @return : boolean value i.e true or false.
	 */
	public boolean isSelected(int option) {

		if (option == choice) {
			action.execute();
			return true;
		} else
			return false;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public Menu getParent() {
		return parent;
	}

	public void setParent(Menu parent) {
		this.parent = parent;
	}

}
