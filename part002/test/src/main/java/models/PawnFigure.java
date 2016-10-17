package models;

import objects.Chessman;


public class PawnFigure extends Chessman {
    private final String NAME = "PW";
    private final boolean FORWARD = true;

    public PawnFigure(String name, int xPosition, int yPosition) {
        super(name, xPosition, yPosition);
    }
    public PawnFigure(){
        setForward(FORWARD);
        setName(NAME);
    }


}
