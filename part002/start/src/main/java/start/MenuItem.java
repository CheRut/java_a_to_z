package ru.dimcher.part002.start;

/**
 * Created by dimsan on 18.09.2016.
 */
public abstract class  MenuItem implements MenuOption {
    private String name;
    private String description;
    private int id;




    public MenuItem(int id) {
        this.id = id;
    }

    abstract public void menuItemInfo(ConsoleInput cIn, Tracker tracker);
    //abstract String ItemData();

}
