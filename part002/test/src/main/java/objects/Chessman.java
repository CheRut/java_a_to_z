package objects;

import interfaces.ChessmanProperties;

import java.util.logging.Logger;

/**
 * Created by DobleBrain on 17.11.2016.
 */
public  class Chessman  implements ChessmanProperties{
    private String name,chessId;
    private int xPosition,yPosition;
    public Logger lg = Logger.getLogger(getClass().getName());
    public ConsoleIO cIO;

    private boolean movementAllowed;

    public Chessman() {
        name = "*";
        cIO =  new ConsoleIO();
    }
    public Chessman(String name){this.name = name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public String getChessId() {
        return chessId;
    }

    public void setChessId(String chessId) {
        this.chessId = chessId;
    }

    public boolean isMovementAllowed() {
        return movementAllowed;
    }

    public void setMovementAllowed(boolean movementAllowed) {
        this.movementAllowed = movementAllowed;
    }

    @Override
    public boolean correctMovement(Chessman chessman, char endXPosition, int endYPosition) {
        return false;
    }


}
