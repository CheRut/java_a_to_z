package ru.dimcher.part002.start;

import ru.dimcher.part002.models.*;

import java.util.*;

public class Tracker {
    private Item[] items = new Item[10];
    private ConsoleInput cInput=new ConsoleInput();
    private int position = 0;
    private ConsoleInput consoleInput;
    private static final Random Rn = new Random();
	
	public Tracker()
	{
		this(10);
	}
	
	/**
	* Constructor for tracker.
	* @param size of items list.
	*/
	public Tracker(int size) {
		items = new Item[size];
		position = 0;
	}
	
    public Item add(Item item) {
		this.items[position++] = item;
        item.setId(String.valueOf(position));
        return item;
    }
	
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {

            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }

        }
        return result;
    }
	
	public Item[] getAll() {
         Item[] result = new Item[position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
            System.out.println(result[index].getName() + " " + result[index].getDescription());
            if(items[index] instanceof Comments){
                Comments comments = (Comments) result[index];
                System.out.println(comments.getName() + " " + comments.getDescription()
                        +" "+(comments.getComm()));
            }
        }
        System.out.println("");
        return result;
    }
	
	public void editById(Item item,String name,String description) {
    Item result = item;
    for (Item item1 : this.items) {
        if (item1==(result)) {
            item1.setName(name);
            item1.setDescription(description);
        }
    }
}
    
	public int menuChoosing() {
          int option = cInput.chooseOption("please, enter the number of needed option: ");
        switch (option) {
            case 0:
                System.exit(1);
            case 1:
                add(new Item(cInput.ask("please,enter the name: "),cInput.ask("please,enter the description: ")));
                add(new Item("first task", "first desc", 0l));
                //add(new Comments("second task", "second desc"));
                add(new Task("third task", "third desc"));
                add(new Task("fourth task", "fourth desc"));
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
        }
        return mainMenu();
    }
   
	public int mainMenu() {
        System.out.println(" ");
        String[] menuList = {"1.Add request", "2.Edit request", "3.Delete request",
                "4.Show request list", "5.Show request list by filter",
                "6.Add comments", "0.Exit"};
        for (int i = 0; i < menuList.length; i++) {
            System.out.println(menuList[i]);
        }
        System.out.println("********************************************************");
return menuChoosing();
    }
   
	public void deleteById(Item item) {
        Item result = item;
        for (Item item1 : this.items) {
            if (item1==(result)) {
                item1.setName(null);
                item1.setDescription(null);
            }
        }
    }
   
	public Item addComments(Item item){
        Comments result = null;
        for (Item it:this.items){
            if ( it.equals(item)){
                System.out.println(it.getName());
                result =(Comments) it;
                ((Comments)result).setComm(cInput.ask("please add the comments: "));
            }
        }
return result;
    }
   
	public Item[] findBy() {
        Item[] result = new Item[10];
        for (int i = 0; i <items.length ; i++) {
            for (int j = 0; j <items.length ; j++) {
                if(i%2!=0){
                    result[i] = items[i];
                }
            }

        }

        return result;
    }
    
	public Item[] getItems() {
        return items;
    }
    
	public void setItems(Item[] items) {
        this.items = items;
    

}
}

