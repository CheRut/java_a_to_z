package models;

import objects.Chessman;


public class CastleFigure extends Chessman {
    private static final String NAME = "CL";

    public CastleFigure() {
        setName(NAME);
        setRight(true);
        setLeft(true);
        setForward(true);
        setBack(true);
    }


}
