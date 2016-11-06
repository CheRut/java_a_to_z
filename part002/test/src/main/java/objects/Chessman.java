package objects;



/**
 * Created by dimsan on 05.10.2016.
 */
public  class Chessman {
    public int index = 0;
    public String name;
    private int xPosition;
    private int yPosition;
    private String chessId;
    private boolean forward;
    private boolean back;
    private boolean left;
    private boolean right;
    private boolean diagonally;
    private boolean knightMoving;
    private boolean movementError;
    private boolean[] privilegues;


    public Chessman() {
        name = "*";
        forward = false;back = false;left = false;
        right = false;diagonally = false;knightMoving = false;
movementError=false;

    }
    public Chessman(String name){this.name = name;}
    public Chessman(String name, int xPosition, int yPosition) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;

    }



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

    public boolean isForward() {
        return forward;
    }

    public void setForward(boolean forward) {
        this.forward = forward;
    }

    public boolean isBack() {
        return back;
    }

    public void setBack(boolean back) {
        this.back = back;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }


    public Chessman forwardMov(Chessman chessman,int yPos) {

        if(forward){
            System.out.println("There is forward moving");


        }else{
            System.out.println("Error message");
        }
        return chessman;
    }

    public void backMov() {
        if (back) {
            System.out.println("There is back moving");
        }else{
            System.out.println("Error message");
        }
    }

    public void leftMov() {
       if(left){
           System.out.println("left side moving");
       }else{
           System.out.println("Error message");
       }
    }

    public void rightMov() {
       if(right){
           System.out.println("right side moving");
       }else{
           System.out.println("Error message");
       }
    }


    public boolean isDiagonally() {
        return diagonally;
    }

    public void setDiagonally(boolean diagonally) {
        this.diagonally = diagonally;
    }

    public boolean isKnightMoving() {
        return knightMoving;
    }

    public void setKnightMoving(boolean knightMoving) {
        this.knightMoving = knightMoving;
    }

    public boolean[] getPrivilegues() {
        return privilegues;
    }

    public void setPrivilegues(boolean[] privilegues) {
        this.privilegues = privilegues;
    }

    public boolean isMovementError() {
        return movementError;
    }

    public void setMovementError(boolean movementError) {
        this.movementError = movementError;
    }
}
