package start;
import gameProcess.MovementChecker;
import models.*;
import objects.ChessBoard;


/**
 * Created by dimsan on 08.10.2016.
 */
public class StartGame {
    public static void main(String[] args) {

        MovementChecker cb = new MovementChecker();

        cb.getEmptyBord();
        cb.shawAll();
        System.out.println();
        cb.add(new PawnFigure(),'C',4);
        cb.add(new CastleFigure(),'D',6);
        cb.add(new KnightFigure(),'E',5);
        cb.add(new BishopFigure(),'E',4);
        cb.add(new QueenFigure(),'B',5);
        cb.add(new KingFigure(),'D',1);
        cb.shawAll();
        System.out.println();
        cb.forwardMove(cb.findChess("1"),'C',5);
        cb.leftMove(cb.findChess("2"),'C',6);
        cb.addMoving(cb.findChess("3"),'G',6);
        cb.diagonallyMove(cb.findChess("4"),'H',7);
        cb.rightMove(cb.findChess("5"),'H',5);
        cb.diagonallyMove(cb.findChess("6"),'E',2);
        cb.forwardMove(cb.findChess("1"),'C',6);




        System.out.println();
//        cb.addMoving("1",0,1);
        cb.shawAll();

        //System.out.println(cb.findById("1").getxPosition()+"-x"+cb.findById("1").getyPosition()+"-y"+cb.findById("1").getName());

    }

}