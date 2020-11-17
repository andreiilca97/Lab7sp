//import Services.AlignCenter;
//import Services.AlignLeft;
//import Services.AlignRight;
import Services.*;
import Models.*;
public class Main {
  /*  public static void main(String[] args) throws Exception {
        Book b = new Book("Cartea");

        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new imageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        cap1.add(new Image("test"));
        BookStatistics stats = new BookStatistics();
        cap1.accept(stats);
        stats.printStatistics();
        cap1.BookSaveVisitor();  */



            public static void main(String[] args) throws Exception {
                Command cmd1 = new OpenCommand();
                cmd1.execute();
                Command cmd2 = new StatisticsCommand();
                cmd2.execute();
                System.out.println("\nThe book: ");
                DocumentManager.getBook().print();
            }
        }

