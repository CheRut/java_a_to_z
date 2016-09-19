ru.dimcher.part002.start

/**
 * Created by dimsan on 19.09.2016.
 */
public class StartUi {
    ConsoleInput cIn = new ConsoleInput();
    private Input input;
    public StartUi(Input input){
        this.input = input;
    }

    public  void init() {
        MenuTracker mTracker = new MenuTracker();
        mTracker.showMenu();
        mTracker.optionSelect(cIn.chooseOption("Please enter the id"));

    }
    public static void main(String[] args)  {
        Input input = new ConsoleInput();
        ConsoleInput cIn = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUi(input).init();
    }
}
