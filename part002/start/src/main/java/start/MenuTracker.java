package start;

import models.Item;

import java.util.Arrays;

/**
 * Created by dimsan on 19.09.2016.
 */
public class MenuTracker {
    private String[] menuItems;
    private ConsoleInput cIn;
    private Tracker tracker;

    public MenuTracker() {
    }

    public MenuTracker(ConsoleInput cIn, Tracker tracker) {
        this.cIn = cIn;
        this.tracker = tracker;
    }

    public  String[] menuNamesFilling(){
        menuItems = new String[7];
        menuItems[0] = "Exit";
        menuItems[1] = "Addtem";
        menuItems[2] = "Edit Item";
        menuItems[3] = "Remove Item";
        menuItems[4] = "Show all Items";
        menuItems[5] = "Show by filter";
        menuItems[6] = "Add comments Item";

        return menuItems;
    }
    class MenuAddItem extends MenuItem {

        public MenuAddItem(int id) {
            super(id);
        }

        public int menuItemId() {
            return 1;
        }

        @Override
        public void menuItemInfo(ConsoleInput cIn, Tracker tracker) {
//            String name = cIn.ask("Please enter the name of the new Item");
//            String description = cIn.ask("Please enter the description of the new Item ");
//            tracker.add(new Item(name,description));
            System.out.println("Adding the new Item");
        }
    }

    class MenuEditItem extends MenuItem {

            public MenuEditItem(int id) {
                super(id);
            }

            public int menuItemId() {
                return 2;
            }

            @Override
            public void menuItemInfo(ConsoleInput cIn, Tracker tracker) {
//            String name = cIn.ask("Please enter the name of the new Item");
//            String description = cIn.ask("Please enter the description of the new Item ");
//            tracker.add(new Item(name,description));
                System.out.println("Editing the  Item");
            }
        }
    class MenuDeleteItem extends MenuItem{
            public MenuDeleteItem(int id) {
                super(id);
            }

            public int menuItemId() {
                return 3;
            }

            @Override
            public void menuItemInfo(ConsoleInput cIn, Tracker tracker) {
//            String name = cIn.ask("Please enter the name of the new Item");
//            String description = cIn.ask("Please enter the description of the new Item ");
//            tracker.add(new Item(name,description));
                System.out.println("Deleting the  Item");
            }
        }
    class MenuShowAllItem extends MenuItem{
        public MenuShowAllItem(int id) {
                super(id);
            }

            public int menuItemId() {
                return 4;
            }

            @Override
            public void menuItemInfo(ConsoleInput cIn, Tracker tracker) {
//            String name = cIn.ask("Please enter the name of the new Item");
//            String description = cIn.ask("Please enter the description of the new Item ");
//            tracker.add(new Item(name,description));
                System.out.println("Show all  Item");
            }
        }
    class  MenuShowByFilterItem extends MenuItem{
            public  MenuShowByFilterItem(int id) {
                super(id);
            }

            public int menuItemId() {
                return 5;
            }

            @Override
            public void menuItemInfo(ConsoleInput cIn, Tracker tracker) {
//            String name = cIn.ask("Please enter the name of the new Item");
//            String description = cIn.ask("Please enter the description of the new Item ");
//            tracker.add(new Item(name,description));
                System.out.println("Show Item by filter");
            }
        }
    class  MenuCommentItem extends MenuItem{
            public  MenuCommentItem(int id) {
                super(id);
            }

            public int menuItemId() {
                return 6;
            }

            @Override
            public void menuItemInfo(ConsoleInput cIn, Tracker tracker) {
//            String name = cIn.ask("Please enter the name of the new Item");
//            String description = cIn.ask("Please enter the description of the new Item ");
//            tracker.add(new Item(name,description));
                System.out.println("Add comment to Item");
            }
        }
    public void optionSelect(int key){
        this.menuAction[key].menuItemInfo(cIn,tracker);
    }
    MenuOption[] menuAction = new MenuOption[10];

        public void menuActionFilling() {
            menuAction[0] = new MenuAddItem(1);
            menuAction[1] = new MenuEditItem(2);
            menuAction[2] = new MenuDeleteItem(3);
            menuAction[3] = new MenuShowAllItem(4);
            menuAction[4] = new MenuShowByFilterItem(5);
            menuAction[5] = new MenuCommentItem(6);

        }
public void showMenu(){
    for (int i = 0; i <menuNamesFilling().length ; i++) {
        System.out.println(i+". "+menuNamesFilling()[i]);
    }
}
    }






