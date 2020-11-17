package Services;
import Models.*;
/*public abstract class AlignStrategy {
    public abstract void render(Paragraph paragraph) ;


    public abstract void setAlignStrategy(AlignStrategy strat);
} */
public interface AlignStrategy {

    void render(Paragraph paragraph);
    void setAlignStrategy(AlignStrategy strat);

}