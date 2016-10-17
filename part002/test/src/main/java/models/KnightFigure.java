package models;

import objects.Chessman;


public class KnightFigure extends Chessman {
    private static final String NAME = "KN";

    public KnightFigure() {
        setName(NAME);
        setRight(true);
        setLeft(true);
        setForward(true);
        setBack(true);
    }


}
