package models;

import objects.Chessman;


public class BishopFigure extends Chessman {
    private final String NAME = "BS";
    private final boolean DIAGONALLY = true;


    public BishopFigure() {
        setName(NAME);
        setDiagonally(DIAGONALLY);
setMovementError(false);
    }


}
