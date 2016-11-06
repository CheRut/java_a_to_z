package models;

import objects.Chessman;


public class KnightFigure extends Chessman {
    private static final String NAME = "KN";
    private boolean wrongMovement;


    public KnightFigure() {
        setName(NAME);
        setKnightMoving(true);
        setMovementError(false);
    }

    public boolean isWrongMovement() {
        return wrongMovement;
    }

    public void setWrongMovement(boolean wrongMovement) {
        this.wrongMovement = wrongMovement;
    }
}
