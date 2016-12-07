package models;

import objects.Chessman;

/**
 * This class defines the Bishop behavior
 *
 * */
public class BishopFigure extends Chessman{


    private final String NAME = "BS";



    public BishopFigure() {
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
        if (chessman != null) {
            int xPos = (int) endXPosition - 64;
            setMovementAllowed(false);
            int baseX = chessman.getXPosition();
            int baseY = chessman.getYPosition();
            int xDestination = xPos - baseX;
            int yDestination = endYPosition - baseY;
            if (xDestination == yDestination) {
                setMovementAllowed(true);
            }else{lg.info(cIO.wrongMovement());}

        }else {lg.info(cIO.nullPointerExcMsg());}
        return isMovementAllowed();
        }


}
