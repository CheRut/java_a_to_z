package objects;

import interfaces.Input;
import interfaces.Output;

import java.util.Scanner;

/**
 * Created by dimsan on 19.10.2016.
 */
public class ConsoleIO implements Input, Output{
 Scanner scanner = new Scanner( System.in );

    public void  print(Object obj) { System.out.print(obj); }

    public void println(Object obj){ System.out.println(obj); }

    public String askText(String question) { System.out.println(question);
        return  scanner.nextLine();
    }

    public int askInt(String question) { System.out.println(question);
        return  scanner.nextInt();
    }
}
