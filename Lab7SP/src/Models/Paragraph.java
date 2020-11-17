package Models;

import Services.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Paragraph implements Element, AlignStrategy {
    public String name;
    AlignStrategy paragraphalignment;
    public Paragraph(String name) {
        this.name=name;
    }

    @Override
    public void render(Paragraph paragraph) {

    }

    public void setAlignStrategy(AlignStrategy strat){
        this.paragraphalignment=strat;
    }

    @Override
    public void print(){

        if(paragraphalignment==null) {
            System.out.println(this.name);
        }else{
            paragraphalignment.render(this);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void tofile() {
        try(FileWriter fw = new FileWriter("E:\\MyStuff\\Facultate\\ANUL 3\\Materii\\SEM 1\\SP\\Lab7SP\\FILE\\Statistics.json", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {out.println("{");
            out.println("   \"Paragraph\":{");
            out.println("         \"name\":"+"\""+this.name+ "\"");
            out.println("   }");
            out.println("}");
        } catch (
                IOException e) {
            //exception handling left as an exercise for the reader
        }}

    @Override
    public Element getElement(int index) {

        return null;
    }
}