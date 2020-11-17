package Models;
import Services.*;

import java.io.*;
import java.util.ArrayList;

public class Section implements Element, Visitor

{
    public String sectionTitle;
    ArrayList<Element> elements = new ArrayList<>();

    public Section(String title)
    {
        this.sectionTitle=title;
    }

    public void add(Element elem)
    {
        elements.add(elem);
    }
    public void remove(Element elem)
    {
        elements.remove(elem);
    }

    public Element getElement(int index )
    {
        return elements.get(index);
    }

    @Override
    public void print() {
        System.out.println("Titlu:" + sectionTitle);
        for(Element e: elements)
        {
            e.print();
        }
    }


    public void accept(BookStatistics visitor) {
        for (Element e1:elements) {
            e1.accept(visitor);
        }
    }



    @Override
    public void accept(Visitor visitor) {

    }

    @Override
    public void tofile() {
        try(FileWriter fw = new FileWriter("E:\\MyStuff\\Facultate\\ANUL 3\\Materii\\SEM 1\\SP\\Lab7SP\\FILE\\Statistics.json", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println("{");
            out.println("   \"Section\":{");
            for(Element e1:elements)
                e1.tofile();
            out.println("   }");
            out.println("}");
        } catch (
                IOException e) {
            //exception handling left as an exercise for the reader
        }}

    public void BookSaveVisitor()
    {    try {

        File myObj = new File("E:\\MyStuff\\Facultate\\ANUL 3\\Materii\\SEM 1\\SP\\Lab6SP\\FILE\\Statistics.json");
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }

        try(FileWriter fw = new FileWriter("E:\\MyStuff\\Facultate\\ANUL 3\\Materii\\SEM 1\\SP\\Lab6SP\\FILE\\Statistics.json", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println("{");
            out.println("   \"Section\":{");
            for(Element e1:elements)
                e1.tofile();
            out.println("   }");
            out.println("}");
        } catch (
                IOException e) {
            //exception handling left as an exercise for the reader
        }
    }
    public void sectionvisit(Visitor visitor)
    {
        visitor.visit(this);
    }



    @Override
    public void visit(Section section) {

    }

    @Override
    public void visit(Image image) {

    }

    @Override
    public void visit(Paragraph paragraph) {

    }

    @Override
    public void visit(imageProxy imageProxy) {

    }

    @Override
    public void visit(Table table) {

    }
}