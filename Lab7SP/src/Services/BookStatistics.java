package Services;

import Models.*;

public class BookStatistics implements Visitor {
    int imageCounter =0;
    int tableCounter =0;
    int paragraphCounter =0;
    int sectionCounter =0;
    @Override
    public void visit(Image image) {
        this.imageCounter++;
    }

    @Override
    public void visit(imageProxy ImageProxy) {
        this.imageCounter++;
    }

    @Override
    public void visit(Paragraph paragraph) {
        this.paragraphCounter++;
    }

    @Override
    public void visit(Table table) {
        this.tableCounter++;
    }

    @Override
    public void sectionvisit(Visitor visitor) {

    }

    @Override
    public void visit(Section section) {
        this.sectionCounter++;
    }

    public void printStatistics(){
        System.out.println("Book Statistics: ");
        System.out.println("***Number of images: "+imageCounter);
        System.out.println("***Number of paragraphs: "+paragraphCounter);
        System.out.println("***Number of tables: "+tableCounter);
        System.out.println("***Number of sections: "+tableCounter);
    }
}
