package models;

import objects.Chessman;


public class KingFigure extends Chessman {
    private static final String NAME = "KG";

    public KingFigure() {
        setName(NAME);
        setForward(true);
        setBack(true);
        setLeft(true);
        setRight(true);
    }

    public KingFigure(String name, int xPosition, int yPosition) {
        super(name, xPosition, yPosition);
    }
}
