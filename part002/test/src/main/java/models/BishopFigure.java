package models;

import objects.Chessman;


public class BishopFigure extends Chessman {
    private static final String NAME = "BS";


    public BishopFigure() {
    setName(NAME);
    setRight(true);
    setLeft(true);
    setForward(true);
    setBack(true);
    }


}
