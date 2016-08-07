package start;
import models.*;
/**
 * Created by dimsan on 02.07.2016.
 */
public class StartUiTest{
    public void init(){

        Tracker tracker = new Tracker();
        tracker.add(new Item("first task", "first desc"));
        tracker.add(new Task("second task", "second desc"));
        tracker.add(new Task("third task", "third desc"));
        tracker.add(new Task("fourth task", "fourth desc"));
        tracker.add(new Task("fifth task", "fifth desc"));
        tracker.add(new Task("sixth task", "sixth desc"));
        tracker.add(new Task("seventh task", "seventh desc"));
        tracker.add(new Task("eighth task", "eighth desc"));//
        tracker.add(new Comments("tenth task", "tens desc","this is comments"));
        for(int index=0;index<tracker.getItems().length;index++){
            tracker.editById(tracker.getItems()[1]);
            break;
        }
        tracker.getAll();
        for(int index=0;index<tracker.getItems().length;index++){
            tracker.deleteById(tracker.getItems()[2]);
            break;
        }
        tracker.getAll();
        for (int i =0;i<tracker.findBy().length;i++) {
            if (tracker.findBy()[i] != null) {
                Item item = tracker.findBy()[i];
                System.out.println(item.getId()+" "+item.getName()+" "+item.getDescription());
            }
        }

    }

    public static void main(String[] args){
        
        new StartUiTest().init();
    }
}