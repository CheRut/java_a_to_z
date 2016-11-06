package models;

import objects.Chessman;


public class KingFigure extends Chessman {
    private static final String NAME = "KG";
    private boolean kingStopMovement;

    public KingFigure() {

        setName(NAME);
        setForward(true);
        setBack(true);
        setLeft(true);
        setRight(true);
        setDiagonally(true);
        kingStopMovement = true;
        setMovementError(false);

    }

    public KingFigure(String name, int xPosition, int yPosition) {
        super(name, xPosition, yPosition);
    }

    public boolean iskingStopMovement() {
        return kingStopMovement;
    }

    public void setkingStopMovement(boolean kingStopMovement) {
        this.kingStopMovement = kingStopMovement;
    }
}
