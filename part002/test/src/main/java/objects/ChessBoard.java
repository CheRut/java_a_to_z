package objects;

import models.CastleFigure;


import java.util.logging.Logger;


/**
 * Created by dimsan on 14.10.2016.
 */
public class ChessBoard extends Chessman{
    private ConsoleIO cIO;
    public Chessman[][] chess;
    private int positionId = 0;
    public Chessman chessman;
    private Chessman mov;
    private Logger lg = Logger.getLogger(getClass().getName());

    public ChessBoard() {
        cIO = new ConsoleIO();
        setChess(new Chessman[9][9]);
        chessman = new CastleFigure();
        mov = new CastleFigure();
    }

    /**
     * @param chessman
     * @param xName
     * @param y
     * @return
     *
     * */

    public Chessman add(Chessman chessman, char xName, int y) {
        try{
        int x = (int) xName - 64;
        chess[y][x] = chessman;
        chess[y][x].setXPosition(x);
        chess[y][x].setYPosition(y);
        positionId++;
        chess[y][x].setChessId(String.valueOf(positionId));
        chessman.setChessId(String.valueOf(positionId));
        chessman.setYPosition(y);
        chessman.setXPosition(x);

        }catch(NullPointerException nPE){
            lg.info(cIO.nullPointerExcMsg());
        }catch (ArrayIndexOutOfBoundsException aBE){
            lg.info(cIO.outOfRangeMsg());}
        return chessman;
    }
    /**
    * @param chessman
    * @param x
    * @param y
    * @return
    * */

    private Chessman add(Chessman chessman, int x, int y) {
       try{
            getChess()[y][x] = chessman;
            positionId++;
            chessman.setChessId(String.valueOf(positionId));
            chessman.setYPosition(y);
            chessman.setXPosition(x);

        }catch(NullPointerException nPE){
            lg.info(cIO.nullPointerExcMsg());
        }catch (ArrayIndexOutOfBoundsException aBE){
           lg.info(cIO.outOfRangeMsg());}
        return chessman;
    }
    /**
     * @return
     * */
    
    public Chessman[][] shawAll() {
        for (int yIndex = 0; yIndex != getChess().length; yIndex++) {
            for (int xIndex = 0; xIndex != getChess().length; xIndex++) {
                System.out.print(getChess()[yIndex][xIndex].getName() + "\t");
            }
            System.out.println();
        }
        chess[0][1].setName("A");
        chess[0][2].setName("B");
        chess[0][3].setName("C");
        chess[0][4].setName("D");
        chess[0][5].setName("E");
        chess[0][6].setName("F");
        chess[0][7].setName("G");
        chess[0][8].setName("H");

        chess[1][0].setName("1");
        chess[2][0].setName("2");
        chess[3][0].setName("3");
        chess[4][0].setName("4");
        chess[5][0].setName("5");
        chess[6][0].setName("6");
        chess[7][0].setName("7");
        chess[8][0].setName("8");
        System.out.println();

        return chess;

    }

    /**
     * @param chessman
    * */
   
    private void updateBord(Chessman chessman) {
        if(chessman!=null){
            for (int i = 0; i < chess.length; i++) {
                for (int j = 0; j < chess.length; j++) {
                    if (chess[i][j].equals(chessman)) {
                        chess[i][j] = new Chessman("*");
                        chess[i][j].setChessId("0");
                    }
                }
            }
        }else{lg.info(cIO.nullPointerExcMsg());}
    }
    /**
     * @param id
     * @return
     * */
   
    public Chessman findChess(String id) {
        Chessman finded = null;
            for (int i = 1; i < getChess().length; i++) {
                for (int j = 1; j < getChess().length; j++) {
                    if (getChess()[i][j] != null && getChess()[i][j].getChessId().equals(id)) {
                    finded = getChess()[i][j];
                    break;
                    } 
                }
            }
        return finded;
    }
    /**@param chessman
     * @param xPosName
     * @param yPos
     * @return
     * */
   
    public boolean presenceOfObstacles (Chessman chessman, char xPosName, int yPos){
            boolean correct = true;
        if(chessman!= null) {
            int xPos = (int) xPosName - 64;
            int xSteps = chessman.getXPosition();
            int ySteps = chessman.getYPosition();
            for (int i = ySteps; i <= yPos; i++) {
                for (int j = xSteps; j <= xPos; j++) {
                    if (!chess[i][j].getChessId().equals(chessman.getChessId()) && !chess[i][j].getClass().equals(Chessman.class)) {
                        correct = false;
                        lg.info(cIO.obstacle());
                    }
                }
            }
        }else {lg.info(cIO.nullPointerExcMsg());}
        return correct;
    }
    /**
     *@param chessman
     *@param xPosName
     *@param yPos
     *@return
     */
    
    public Chessman addMoving(Chessman chessman, char xPosName, int yPos) {
        if (chessman !=null) {
            chessman.correctMovement(chessman, xPosName, yPos);
            boolean notErrorMove = presenceOfObstacles(chessman, xPosName, yPos);
            mov = chessman;
            int xPos = (int) xPosName - 64;
            String idPos = chessman.getChessId();
            updateBord(chessman);
            mov.setName(chessman.getName());
            mov.setYPosition(yPos);
            mov.setXPosition(xPos);
            if (mov.isMovementAllowed() && notErrorMove) {
                add(mov, mov.getXPosition(), mov.getYPosition());
                mov.setChessId(idPos);
                getChess()[yPos][xPos].setChessId(idPos);
                getChess()[yPos][xPos].setName(mov.getName());
            }
        }else {lg.info(cIO.nullPointerExcMsg());}
        shawAll();
            return mov;
        }
/**
 * @return
 * */
    
    public Chessman[][] getEmptyBord() {
        for (int i = 0; i < getChess().length; i++) {
            for (int j = 0; j < getChess().length; j++) {
                getChess()[i][j] = new Chessman();
                getChess()[i][j].setName("*");
                getChess()[i][j].setYPosition(i);
                getChess()[i][j].setXPosition(j);
                getChess()[i][j].setChessId("0");
            }
        }
        getChess()[0][1].setName("A");
        getChess()[0][2].setName("B");
        getChess()[0][3].setName("C");
        getChess()[0][4].setName("D");
        getChess()[0][5].setName("E");
        getChess()[0][6].setName("F");
        getChess()[0][7].setName("G");
        getChess()[0][8].setName("H");

        getChess()[1][0].setName("1");
        getChess()[2][0].setName("2");
        getChess()[3][0].setName("3");
        getChess()[4][0].setName("4");
        getChess()[5][0].setName("5");
        getChess()[6][0].setName("6");
        getChess()[7][0].setName("7");
        getChess()[8][0].setName("8");
        return getChess();
    }
    /**
    * @return
    * */
    public Chessman[][] getChess() {
        return chess;
    }
/**
 * @param chess */
    public void setChess(Chessman[][] chess) {
        this.chess = chess;
    }
}
