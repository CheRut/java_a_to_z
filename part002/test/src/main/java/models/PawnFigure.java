package models;

import objects.Chessman;
import objects.ConsoleIO;

import java.util.logging.Logger;

/**
 * This class defines the Pawn behavior
 *
 * */
public class PawnFigure extends Chessman {
      private ConsoleIO cIO;
    private final String NAME = "PW";
    private  int movementsCounter = 0;
    private Logger lg = Logger.getLogger(getClass().getName());

    public PawnFigure(){
        cIO = new ConsoleIO();
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
        if ((yDestination == 1 && xDestination == 0) && movementsCounter > 0) {
            setMovementAllowed(true);
        }
        if (((yDestination == 2 || yDestination == 1) && xDestination == 0) && movementsCounter == 0) {
            setMovementAllowed(true);
        }else{lg.info(cIO.wrongMovement());}
}else {lg.info(cIO.nullPointerExcMsg());}
        movementsCounter = 1;
        return isMovementAllowed();
    }

}
