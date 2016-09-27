package start;

import models.Comments;
import models.Item;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class shows the menu structure, built on the inner classes
 */
public class MenuTracker {
    private String[] menuItems;
    Logger lg = Logger.getLogger(Tracker.class.getName());

	/*
	* An instance of  ConsoleInput to do some input output operations
	**/
	
    private ConsoleInput cIn;
	
	/*
	* An instance of Tracker containing the program logic.
	**/
    private Tracker tracker;
	
	
	
    private int position = 0;

/*
* Constructor that takes an instance of  
* input - output object,and Tracker instance,
* to activate needed operations
**/
	
    public MenuTracker(ConsoleInput cIn,Tracker tracker) {
        this.cIn = cIn;
        this.tracker = tracker;
    }

	/*
	*	Simple array of the menu items names; 
	*	@return: array menuItems
	**/

    public String[] menuNamesFilling() {
        menuItems = new String[6];
        menuItems[0] = "Add Item";
        menuItems[1] = "Edit Item";
        menuItems[2] = "Remove Item";
        menuItems[3] = "Show all Items";
        menuItems[4] = "Show by filter";
        menuItems[5] = "Add comments Item";

        return menuItems;
    }

	/*
	* An inner class that inherits from the abstract class,and 
	* overriding super class method  to add all items by Tracker instance using
	* @param: menuItemId() method to get the call position 
	**/
        class MenuAddItem extends MenuItem {


        public int menuItemId() {
            return 1;
        }
        @Override
        public void menuItemInfo(ConsoleInput cIn, Tracker tracker) {
            System.out.println("Adding the new Item");
            String name = cIn.ask("Please enter the  name of the new Item");
            String description = cIn.ask("Please enter the description of the new Item ");
            tracker.add(new Item(name,description));
        }
    }
	
	/*
	* An inner class that inherits from the abstract class,and 
	* overriding super class method  to edit nedded items by Tracker instance using
	* @param: menuItemId() method to get the call position 
	**/
    class MenuEditItem extends MenuItem {


        public int menuItemId() {
            return 2;
        }

        @Override
        public void menuItemInfo(ConsoleInput cIn, Tracker tracker) {
            System.out.println("Editing the  Item");
            String id = cIn.ask("Please,enter the needed id");

            String name = cIn.ask("Please enter a new name for a given item");
            String description = cIn.ask("Please enter a new description for a given item");
            tracker.editById(tracker.findById(id),name,description);
        }
    }
	/*
	* An inner class that inherits from the abstract class,and 
	* overriding super class method to delete needed items by Tracker instance using
	* @param: menuItemId() method to get the call position 
	**/
    class MenuDeleteItem extends MenuItem {

        public int menuItemId() {
            return 3;
        }
        @Override
        public void menuItemInfo(ConsoleInput cIn, Tracker tracker) {
            System.out.println("Item removing");
            String id = cIn.ask("Please,enter the id you want to delete");
            tracker.deleteById(tracker.findById(id));
        }

    }
	/*
	* An inner class that inherits from the abstract class,and 
	* overriding super class method  to shows items list by Tracker instance using
	* @param: menuItemId() method to get the call position 
	**/
    class MenuShowAllItem extends MenuItem {

        public int menuItemId() {
            return 4;
        }

        @Override
        public void menuItemInfo(ConsoleInput cIn, Tracker tracker) {
            System.out.println("Show all Item");


             tracker.getAll();

        }
           }
    /*
        * An inner class that inherits from the abstract class,and
        * overriding super class method  to shows the items by specific filter,for example by id with even values
        * @param: menuItemId() method to get the call position
        **/
    class MenuShowByFilterItem extends MenuItem {

        public int menuItemId() {
            return 5;
        }
        @Override
        public void menuItemInfo(ConsoleInput cIn, Tracker tracker) {
            System.out.println("Show by filter");
            tracker.findBy();
        }
    }
	/*
	* An inner class that inherits from the abstract class,and 
	* overriding super class method  to add a comments to needed item
	* @param: menuItemId() method to get the call position 
	**/
    class MenuCommentItem extends MenuItem {

        public int menuItemId() {
            return 6;
        }
        @Override
        public void menuItemInfo(ConsoleInput cIn, Tracker tracker) {
            System.out.println("Add comment to Item");
            String id = cIn.ask("Please,enter the id of item which you want to add a comments");

            tracker.addComments(tracker.findById(id));

        }
    }
/**
*	Method, which takes the value of the selected menu item
*/

    public void optionSelect(int key) {
        try {
            this.menuAction[--key].menuItemInfo(this.cIn, this.tracker);
        }catch(NullPointerException nPE){String msg = "PLEASE CHECK THE VALUE,THAT YOU HAVE ENTERED ";
        lg.log(Level.WARNING,msg);}
        catch(ArrayIndexOutOfBoundsException aIBOE){String msg = "PLEASE CHECK THE VALUE,THAT YOU HAVE ENTERED ";
            lg.log(Level.WARNING,msg);}
    }

    private MenuOption[] menuAction = new MenuOption[10];
	/*
	*	Array of the MenuOption object instances for implementation all inners classes
	*	By using key value,we can choose the needed option
	**/
    public void menuActionFilling() {

        menuAction[position++] = new MenuAddItem();
        menuAction[position++] = new MenuEditItem();
        menuAction[position++] = new MenuDeleteItem();
        menuAction[position++] = new MenuShowAllItem();
        menuAction[position++] = new MenuShowByFilterItem();
        menuAction[position++] = new MenuCommentItem();
    }

    public void showMenu() {
        int id=0;
        for (int i = 0; i < menuNamesFilling().length; i++) {
            id++;
            System.out.println(menuAction[i].menuItemId() + ". " + menuNamesFilling()[i]);
        }

    }

}




