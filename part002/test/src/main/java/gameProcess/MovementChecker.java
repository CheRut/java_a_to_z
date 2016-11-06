package gameProcess;

import objects.ChessBoard;
import objects.Chessman;
import objects.MovementsLogic;

import java.util.logging.Logger;

/**
 * Created by dimsan on 07.11.2016.
 */
public class MovementChecker extends ChessBoard{
    private  int yDest=0;
    private int xDest = 0;
    private int movementsCounter = 0;
    private boolean movementError;
    private Logger lg = Logger.getLogger(getClass().getName());

    public MovementChecker(){

    }
    public boolean knightIsMovedCheck(Chessman chessman, int endXPosition, int endYPosition){
        boolean checkingResult = false;
        int baseX = chessman.getXPosition();
        int baseY = chessman.getYPosition();
        int xMovement[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMovement[] = {-1, -2, -2, -1, 1, 2, 2, 1};
        for (int i = 0; i <xMovement.length ; i++) {
            for (int j = 0; j <yMovement.length ; j++) {
                if (endXPosition - baseX == xMovement[i] && endYPosition - baseY == yMovement[i]) {
                    checkingResult = true;
                }
            }
        }
        return checkingResult;
    }
    public boolean pawnIsMovedCheck(Chessman chessman,int endXPosition,int endYPosition){
        boolean resultChecker= false;

        int baseX = chessman.getXPosition();
        int baseY = chessman.getYPosition();
        int xDestination = endXPosition - baseX;
        int yDestination = endYPosition - baseY;

        if((yDestination == 1 && xDestination==0)&& movementsCounter>0){
            movementError = false;
            System.out.println("there is not first movement for this pawn");
            resultChecker = true;}

        else if(((yDestination > 1  && xDestination == 0)&& movementsCounter>0)){
            lg.info("pawn has done 2 cell movement");
            movementError=true;
        }
        if(((yDestination == 2  || yDestination == 1) && xDestination == 0)&& movementsCounter==0)
        {
            System.out.println("there is the first movement for this pawn");

            resultChecker = true;}
        movementsCounter = 1;
        return resultChecker;
    }
    public boolean bishopIsMovedCheck(Chessman chessman,int endXPosition,int endYPosition){
        boolean resultChecker= false;
        int baseX = chessman.getXPosition();
        int baseY = chessman.getYPosition();
        int xDestination = endXPosition - baseX;
        int yDestination = endYPosition - baseY;
        if(xDestination == yDestination){
            resultChecker = true;}
        xDest = xDestination;
        yDest = yDestination;
        return resultChecker;
    }
    public boolean castleIsMovedCheck(Chessman chessman,int endXPosition,int endYPosition){
        boolean resultChecker= false;
        int baseX = chessman.getXPosition();
        int baseY = chessman.getYPosition();
        int xDestination = endXPosition - baseX;
        int yDestination = endYPosition - baseY;
        if(xDestination !=0 && yDestination==0 || yDestination!=0 && xDestination==0){
            resultChecker = true;}
        xDest = xDestination;
        yDest = yDestination;
        return resultChecker;
    }
    public boolean queenIsMovedCheck(Chessman chessman,int endXPosition,int endYPosition){
        boolean resultChecker = false;
        if(bishopIsMovedCheck(chessman,endXPosition,endYPosition) || castleIsMovedCheck(chessman,endXPosition,endYPosition)){
            resultChecker = true;}
        return resultChecker;
    }
    public boolean kingIsMovedCheck(Chessman chessman,int endXPosition,int endYPosition){
        boolean resultChecker = false;
        int baseX = chessman.getXPosition();
        int baseY = chessman.getYPosition();
        int xDestination = endXPosition - baseX;
        int yDestination = endYPosition - baseY;
        xDest = xDestination;
        yDest = yDestination;
        int xMovement[] = {0, 1, 1, 1, 0, -1, -1, -1};
        int yMovement[] = {-1, -1, 0, 1, 1, 1, 0, -1};
        for (int i = 0; i <xMovement.length ; i++) {
            for (int j = 0; j <yMovement.length ; j++) {
                if(xDest ==xMovement[i]&&yDest==yMovement[i])
                {resultChecker = true;}
            }
        }
        return resultChecker;
    }
    public void forwardMove(Chessman chessman, char xPosition, int yPosition) {

        if (chessman.isForward() && !movementError) {
            addMoving(chessman, xPosition, yPosition);
        } else {
            lg.info("This figure can not be moved in such a way");
        }

    }
    public void backMove(Chessman chessman, char xPosition, int yPosition) {
        if (chessman.isBack()&& !chessman.isMovementError()) {
            addMoving(chessman, xPosition, yPosition);
        } else {
            lg.info("This figure can not be moved in such a way");
        }
    }
    public void leftMove(Chessman chessman, char xPosition, int yPosition) {
        if (chessman.isLeft()&& !chessman.isMovementError()) {
            addMoving(chessman, xPosition, yPosition);
        } else {
            lg.info("This figure can not be moved in such a way");
        }
    }
    public void rightMove(Chessman chessman, char xPosition, int yPosition) {
        if (chessman.isRight()&& !chessman.isMovementError()) {
            addMoving(chessman, xPosition, yPosition);
        } else {
            lg.info("This figure can not be moved in such a way");
        }
    }
    public void diagonallyMove(Chessman chessman,char xPosition, int yPosition) {
        if (chessman.isDiagonally()&& !chessman.isMovementError())
            addMoving(chessman, xPosition, yPosition);

        else {
            lg.info("This figure can not be moved in such a way");
        }
    }
    public void knightMove(Chessman chessman, char xPositionName, int yPosition) {
        if (chessman.isRight()&& !chessman.isMovementError())
            addMoving(chessman, xPositionName, yPosition);
        else {
            lg.info("This figure can not be moved in such a way");
        }
    }

}
