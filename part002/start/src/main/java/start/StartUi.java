package start;

/**
 * Created by dimsan on 19.09.2016.
 */
public class StartUi  {
    private final Tracker tracker;
    private  final ConsoleInput cIn;


    public StartUi(ConsoleInput cIn){
        this.cIn = cIn;
        tracker = new Tracker();
    }
public void greeting(){
    System.out.println((char)27+"[33;2mWELCOME TO TRACKER "+(char)27+"[0m");
}
    public void exitAppText(){
        System.out.println((char)27+"[31;2mcreating by dmiCher  "+(char)27+"[0m");

    }
    public  void init() {
        greeting();
        MenuTracker mTracker = new MenuTracker(this.cIn,this.tracker);
        mTracker.menuActionFilling();
        do {
            mTracker.showMenu();
            int key = cIn.chooseOption((char)27 + "[34;4mType a command: "+(char)27+"[0m");
            mTracker.optionSelect(key);
        } while (!"y".equals(cIn.ask((char)27+"[31mExit(y): "+(char)27+"[0m")));
        exitAppText();
    }
    public static void main(String[] args)  {
        InputStrValue inputStrValue = new ConsoleInput();
        ConsoleInput cIn = new ConsoleInput();
        Tracker tracker = new Tracker();
        //new StartUi(cIn).greeting();
        new StartUi(cIn).init();
    }
}
