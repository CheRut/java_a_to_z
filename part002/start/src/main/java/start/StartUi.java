package ru.dimcher.part002.start;


public class StartUi{
    private Input input;
		Tracker tracker;
    public StartUi(Input input){
        this.input = input;
    }
    public void init(){
		
        Tracker tracker = new Tracker();
        
		tracker.mainMenu();
        tracker.menuChoosing();
        tracker.getAll();
		}
    public static void main(String[] args){
        Input input = new ConsoleInput();
        new StartUi(input).init();
    }
}