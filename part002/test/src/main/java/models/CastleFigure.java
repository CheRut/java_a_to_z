package models;

import objects.Chessman;

import java.util.logging.Logger;
/**
 * This class defines the Castle behavior
 *
 * */

public class CastleFigure extends Chessman {
    private static final String NAME = "CL";
    private Logger lg = Logger.getLogger(getClass().getName());

    public CastleFigure() {
        setName(NAME);

    }

    /**
     * @param chessman
     * @param endXPosition
     * @param endYPosition
     * @return
     * */
    @Override
    public boolean correctMovement(Chessman chessman, char endXPosition, int endYPosition) {
        if (chessman!=null) {
            int xPos = (int) endXPosition - 64;
            setMovementAllowed(false);
            int baseX = chessman.getXPosition();
            int baseY = chessman.getYPosition();
            int xDestination = xPos - baseX;
            int yDestination = endYPosition - baseY;
            if (xDestination != 0 && yDestination == 0 || yDestination != 0 && xDestination == 0) {
                setMovementAllowed(true);
            }else{lg.info(cIO.wrongMovement());}
        }else {lg.info(cIO.nullPointerExcMsg());}
        return isMovementAllowed();
    }
}
