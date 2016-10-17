package start;
import models.BishopFigure;
import models.CastleFigure;
import models.PawnFigure;
import objects.ChessBoard;
import objects.Chessman;


/**
 * Created by dimsan on 08.10.2016.
 */
public class StartGame {
    public static void main(String[] args) {
        ChessBoard cb = new ChessBoard();
        cb.getEmptyBord();
        cb.shawAll();
        System.out.println();
        cb.add(new PawnFigure(),3,3);
        cb.add(new CastleFigure(),4,6);
        cb.shawAll();
        System.out.println();
        cb.addMoving(cb.findChess("1"),0,1);
        cb.addMoving(cb.findChess("2"),-1,-1);

        System.out.println();
//        cb.addMoving("1",0,1);
        cb.shawAll();
        //System.out.println(cb.findById("1").getxPosition()+"-x"+cb.findById("1").getyPosition()+"-y"+cb.findById("1").getName());

    }

}