package start;

import models.*;
import objects.ChessBoard;
import objects.Chessman;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by DobleBrain on 07.12.2016.
 */

public class StartUiTest{
    private ChessBoard cb;


    @Before
    public void addingItemTester() {
        cb = new ChessBoard();
        cb.add(new PawnFigure(),'A',4);
        cb.add(new CastleFigure(),'A',5);
        cb.add(new KnightFigure(),'C',4);
        cb.add(new BishopFigure(),'E',4);
        cb.add(new QueenFigure(),'D',4);
        cb.add(new KingFigure(),'F',4);



    }

    @Test
    public void findChessmanTester(){
        assertNotNull(cb.findChess("1"));
        assertNotNull(cb.findChess("2"));
        assertNotNull(cb.findChess("3"));
        assertNotNull(cb.findChess("4"));
        assertNotNull(cb.findChess("5"));
        assertNotNull(cb.findChess("6"));


    }

    @Test
    public void presenceOfObstacles () {
        boolean correct = true;
        if (cb.findChess("1") != null) {
            int xPos = 0;
            int xSteps = cb.findChess("1").getXPosition();
            int ySteps = cb.findChess("1").getYPosition();
            for (int i = ySteps; i <= 7; i++) {
                for (int j = xSteps; j <= xPos; j++) {
                    if (!cb.chess[i][j].getChessId().equals(cb.findChess("1").getChessId()) && !cb.chess[i][j].getClass().equals(Chessman.class)) {
                        correct = false;

                    }
                }
            }
        }
        assertTrue(correct);

    }
    

}
