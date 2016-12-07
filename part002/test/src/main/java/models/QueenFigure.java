package models;

import objects.Chessman;
/**
 * This class defines the Queen behavior
 *
 * */

public class QueenFigure extends Chessman {
    private static final String NAME = "QN";
    public QueenFigure() {
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
        if(chessman != null) {
            setMovementAllowed(false);
            BishopFigure bF = new BishopFigure();
            CastleFigure cF = new CastleFigure();
            if (bF.correctMovement(chessman, endXPosition, endYPosition) || cF.correctMovement(chessman, endXPosition, endYPosition)) {
                setMovementAllowed(true);
            }else{lg.info(cIO.wrongMovement());}
        }else {lg.info(cIO.nullPointerExcMsg());}
        return isMovementAllowed();
    }
}
