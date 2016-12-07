package interfaces;

/**
 * Created by DobleBrain on 07.12.2016.
 */
public interface Output {
    String outOfRangeMsg();
    String nullPointerExcMsg();
    String wrongMovement();
    String obstacle();
    void println(Object object);
    void print (Object object);
}
