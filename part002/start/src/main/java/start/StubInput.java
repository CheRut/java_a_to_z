package start;

import  models.*;
/**
 * Created by dimsan on 02.07.2016.
 */
public class StubInput implements Input{
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers){
        this.answers = answers;

    }

    public String ask(String question){
        return answers[position++];

    }

    public String choice(String number) {
        return null;
    }

    public int mainMenu() {
        return 0;
    }
    public int chooseOption(String question){return 0;}
}

