package objects;

import models.PawnFigure;

/**
 * Created by dimsan on 14.10.2016.
 */
public class ChessBoard   {
    public Chessman [][]chess;
    private int positionId;
    Chessman chessman;


   public  ChessBoard(){
       chess = new Chessman[9][9];
       chessman = new Chessman();
       positionId = 0;
   }

    public Chessman add(Chessman chessman,int x,int y) {
        chess[y][x] = chessman;
        positionId++;
        chessman.setChessId(String.valueOf(positionId));
        chessman.setyPosition(y);
        chessman.setxPosition(x);

        return chessman;
    }

    public Chessman[][]shawAll() {
        for (int yIndex = 0; yIndex != chess.length; yIndex++) {
            for (int xIndex = 0; xIndex !=chess.length; xIndex++) {


                System.out.print(chess[yIndex][xIndex].getName()+"\t");
            }
            System.out.println();
        }
        chess[0][1].setName("A");chess[0][2].setName("B");chess[0][3].setName("C");chess[0][4].setName("D");
        chess[0][5].setName("E");chess[0][6].setName("F");chess[0][7].setName("G");chess[0][8].setName("H");

        chess[1][0].setName("1");chess[2][0].setName("2");chess[3][0].setName("3");chess[4][0].setName("4");
        chess[5][0].setName("5");chess[6][0].setName("6");chess[7][0].setName("7");chess[8][0].setName("8");
        return chess;
    }
   public void updateBord(Chessman chessman){
        for (int i = 0; i <chess.length ; i++) {
            for (int j = 0; j <chess.length ; j++) {
                if(chess[i][j].equals(chessman)){
                    chess[i][j]=new Chessman("*");
                    chess[i][j].setChessId("0");
                }
            }
        }
    }


    public Chessman findChess(String id) {
        Chessman finded = null;
        for (int i = 1; i <chess.length ; i++) {
            for (int j = 1; j <chess.length ; j++) {
                if (chess[i][j]!=null&&chess[i][j].getChessId().equals(id)) {
                    finded = chess[i][j];
                    break;
            }
        }

    }
        return finded;
    }

    public Chessman addMoving( Chessman chessman,int xPos,int yPos) {
        Chessman mov = chessman;
        String idPos = chessman.getChessId();
        updateBord(chessman);
        mov.setName(chessman.getName());
        mov.setyPosition(chessman.getyPosition()+yPos);
        mov.setxPosition(chessman.getxPosition()+xPos);
       // getEmptyBord();
        add(mov,mov.getxPosition(),mov.getyPosition());
        mov.setChessId(idPos);
        chessman = this.chessman;



        System.out.println("id = "+mov.getChessId()+" Name = "+mov.getName()+" x = "+ mov.getxPosition()+" y = "+mov.getyPosition());
        System.out.println("id = "+chessman.getChessId()+" Name = "+chessman.getName()+" x = "+ chessman.getxPosition()+" y = "+chessman.getyPosition());

        return mov;
    }
    public Chessman[][]getEmptyBord() {
    for (int i = 0; i < chess.length; i++) {
        for (int j = 0; j <chess.length; j++) {
            chess[i][j] = new Chessman();
            chess[i][j].setName("*");
            chess[i][j].setyPosition(i);
            chess[i][j].setxPosition(j);
            chess[i][j].setChessId("0");


        }
    }
        chess[0][1].setName("A");chess[0][2].setName("B");chess[0][3].setName("C");chess[0][4].setName("D");
        chess[0][5].setName("E");chess[0][6].setName("F");chess[0][7].setName("G");chess[0][8].setName("H");

        chess[1][0].setName("1");chess[2][0].setName("2");chess[3][0].setName("3");chess[4][0].setName("4");
        chess[5][0].setName("5");chess[6][0].setName("6");chess[7][0].setName("7");chess[8][0].setName("8");
    return chess;
}
}

