package interfaces;

import objects.Chessman;

/**
 * This interface needed to verify the chessmen movements correctness
 */
public interface ChessmanProperties {
    /**
     * @param chessman
     * @param endXPosition
     * @param endYPosition
     * */
    boolean correctMovement(Chessman chessman, char endXPosition, int endYPosition);
}
