package start;

import models.Comments;
import models.Item;

/**
 * Created by dimsan on 19.09.2016.
 */
public class MenuTracker {
    private String[] menuItems;
    private ConsoleInput cIn;
    private Tracker tracker;
    private int position = 0;


    public MenuTracker(ConsoleInput cIn,Tracker tracker) {
        this.cIn = cIn;
        this.tracker = tracker;
    }



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

        class MenuAddItem extends MenuItem {


        public int menuItemId() {
            return 1;
        }
        @Override
        public void menuItemInfo(ConsoleInput cIn, Tracker tracker) {
            System.out.println("Adding the new Item");
            String name = cIn.ask("Please enter the  name of the new Item");
            String description = cIn.ask("Please enter the description of the new Item ");
            tracker.add(new Comments(name,description));
        }
    }

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


    public void optionSelect(int key) {
        this.menuAction[--key].menuItemInfo(this.cIn, this.tracker);

    }

    private MenuOption[] menuAction = new MenuOption[10];

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




