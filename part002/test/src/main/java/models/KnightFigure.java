package models;

import objects.Chessman;
/**
 * This class defines the Knight behavior
 *
 * */

public class KnightFigure extends Chessman {
    private static final String NAME = "KN";
       public KnightFigure() {
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
            int xMovement[] = {2, 1, -1, -2, -2, -1, 1, 2};
            int yMovement[] = {-1, -2, -2, -1, 1, 2, 2, 1};
            for (int i = 0; i < xMovement.length; i++) {
                for (int j = 0; j < yMovement.length; j++) {
                    if (xPos - baseX == xMovement[i] && endYPosition - baseY == yMovement[i]) {
                        setMovementAllowed(true);
                    }else{lg.info(cIO.wrongMovement());}
                }
            }
        }else {lg.info(cIO.nullPointerExcMsg());}
        return isMovementAllowed();
    }
}
