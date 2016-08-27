package ru.dimcher.part002.start;

import ru.dimcher.part002.models.*;

/**
 * This class displays the menu and responds to user input
 */
public class MenuTracker extends Tracker{
    ConsoleInput cInput = new ConsoleInput();
    /**
     * Menu option selector
     * @param: option -  serial number of menu item.
     * @return : mainMenu
     * */
    public int menuChoosing() {
                int option = cInput.chooseOption("please, enter the number of needed option: ");
                switch (option) {
                case 0:
                    System.exit(1);
                case 1:
                    add(new Item(cInput.ask("please,enter the name: "), cInput.ask("please,enter the description: ")));//
                    break;
                case 2:
					editById(findById(cInput.ask("please choose the id: ")),cInput.ask("please,enter the name"),cInput.ask("please,enter the description"));
					break;
                case 3:
                    deleteById(findById(cInput.ask("please,enter the id you want to delete: ")));
                    break;
                case 4:
                    getAll();
                    break;
                case 5:
                    for (int i = 0; i < findBy().length; i++) {
                        if (findBy()[i] != null) {
                            Item item = findBy()[i];
                            System.out.println(item.getName() + " " + item.getDescription());
                        }
                    }
                    break;
                case 6:
                    addComments(findById(cInput.ask("please,enter the id you want adding a comments ")));
                    break;
                case 7:
                    return mainMenu();

                default:
                    System.err.print("Please,check the entered value!");

            }
        return mainMenu();


    }
    /**
     * method filling menu items
     * @param: menuList - menu list array
     * @return: menuChoosing again
     * */
    public int mainMenu()  {
        System.out.println(" ");
        String[] menuList = {"1.Add request", "2.Edit request", "3.Delete request",
                "4.Show request list", "5.Show request list by filter",
                "6.Add comments", "0.Exit"};
        for (int i = 0; i < menuList.length; i++) {
            System.out.println(menuList[i]);
        }

        return menuChoosing();
    }
}
