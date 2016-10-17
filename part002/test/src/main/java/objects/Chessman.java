package objects;



/**
 * Created by dimsan on 05.10.2016.
 */
public  class Chessman {

    public String name;
    private int xPosition;
    private int yPosition;
    private String chessId;
    private boolean forward;
    private boolean back;
    private boolean left;
    private boolean right;

    public Chessman() {
name = "*";

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

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
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


}
