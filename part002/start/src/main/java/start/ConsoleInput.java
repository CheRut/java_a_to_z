package start;

import models.Item;

import java.util.Scanner;

/**
 * Created by dimsan on 18.09.2016.
 */
public class ConsoleInput implements InputStrValue,InputIntValue {
    private Scanner scanner = new Scanner(System.in);
    private Item item;
    private int position = 0;

    public String ask(String question) {
        System.out.println((char)27 + "[33m"+question+": "+(char)27+"[0m");
        return scanner.next();
    }

    public int chooseOption(String question) {
        System.out.print((char)27 + "[33m"+question+": "+(char)27+"[0m");
        return scanner.nextInt();
    }
}
