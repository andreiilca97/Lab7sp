package Models;
import Services.*;
public interface Visitor{


    public  void visit(Section section);

    public  void visit(Image image);

    public  void visit(Paragraph paragraph);

    public  void visit(imageProxy imageProxy);

    public  void visit(Table table);
    public  void sectionvisit(Visitor visitor);


}
