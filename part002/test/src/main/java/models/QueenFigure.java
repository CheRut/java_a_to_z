package models;

import objects.Chessman;


public class QueenFigure extends Chessman {
    private static final String NAME = "QN";

    public QueenFigure() {
        setName(NAME);
        setRight(true);
        setLeft(true);
        setForward(true);
        setBack(true);
        setDiagonally(true);
        setMovementError(false);
    }


}
