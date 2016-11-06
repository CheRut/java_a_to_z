package objects;

/**
 * Created by dimsan on 14.10.2016.
 */
public interface MovementsLogic {
    void forwardMove(Chessman chessman,int xPosition,int yPosition);
    void backMove(Chessman chessman,int xPosition,int yPosition);
    void leftMove(Chessman chessman,int xPosition,int yPosition);
    void rightMove(Chessman chessman,int xPosition,int yPosition);
    void diagonallyMove(Chessman chessman,int xPosition,int yPosition);
    void knightMove(Chessman chessman,char xPositionName,int yPosition);

}
