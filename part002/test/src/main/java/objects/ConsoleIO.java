package objects;

import interfaces.Input;
import interfaces.Output;

import java.util.Scanner;

/**
 * Created by DobleBrain on 07.12.2016.
 */
public class ConsoleIO implements Input, Output {
    Scanner scanner = new Scanner(System.in);

    @Override
    public String ask() {
        System.out.println("Please enter the parameter");
        return scanner.next();
    }

    @Override
    public char askLit() {
        System.out.println("Please enter the name of cell: 'A,B,C... etc'");
        return scanner.next().charAt(0);
    }

    @Override
    public int cellNumber() {
        System.out.println("Please enter the cell number");
        return scanner.nextInt();
    }

    @Override
    public String outOfRangeMsg() {
        return "Your figure is within range.Please check the correctness of the specified data";
    }

    @Override
    public String nullPointerExcMsg() {
    return "It is impossible to carry out these actions with a non-existent object.";
    }
    @Override
    public String wrongMovement() {
    return "Incorrect chessman movement";
    }
    @Override
    public String obstacle() {
        return "There are other chessman on the way";
    }
    @Override
    public void println(Object object) {
        System.out.println(object);
    }

    @Override
    public void print(Object object) {
        System.out.print(object);
    }
}
