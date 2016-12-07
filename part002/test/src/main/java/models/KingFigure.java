package models;

import objects.Chessman;
/**
 * This class defines the King behavior
 *
 * */

public class KingFigure extends Chessman {
    private static final String NAME = "KG";
    private boolean kingStopMovement;

    public KingFigure() {

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
            setMovementAllowed(false);
            int xPos = (int) endXPosition - 64;
            int baseX = chessman.getXPosition();
            int baseY = chessman.getYPosition();
            int xDestination = xPos - baseX;
            int yDestination = endYPosition - baseY;
            int xMovement[] = {0, 1, 1, 1, 0, -1, -1, -1};
            int yMovement[] = {-1, -1, 0, 1, 1, 1, 0, -1};
            for (int i = 0; i < xMovement.length; i++) {
                for (int j = 0; j < yMovement.length; j++) {
                    if (xDestination == xMovement[i] && yDestination == yMovement[i]) {
                        setMovementAllowed(true);
                    } else{lg.info(cIO.wrongMovement());}
                }
            }
        }else {lg.info(cIO.nullPointerExcMsg());}
        return isMovementAllowed();
    }
}
