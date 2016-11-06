package models;

import objects.Chessman;


public class PawnFigure extends Chessman {
    private final String NAME = "PW";
    private final boolean FORWARD = true;

    private int moveCounter;

    public PawnFigure(String name, int xPosition, int yPosition) {
        super(name, xPosition, yPosition);
        setMovementError(false);
    }
    public PawnFigure(String id,int moveCounter){
        super(id);
        this.moveCounter = moveCounter;
    }
    public PawnFigure(){
        setForward(FORWARD);
        setName(NAME);
        setMovementError(false);

    }






    public int getMoveCounter() {
        return moveCounter;
    }

    public void setMoveCounter(int moveCounter) {
        this.moveCounter = moveCounter;
    }
}
