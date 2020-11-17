package Services;
import Models.*;
public class AlignRight implements AlignStrategy {

    public void render(String paragraph){
        System.out.println(paragraph+"+++++");
    }

    @Override
    public void render(Paragraph paragraph) {

    }

    @Override
    public void setAlignStrategy(AlignStrategy strat) {

    }
}