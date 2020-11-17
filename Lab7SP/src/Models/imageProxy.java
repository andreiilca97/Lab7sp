package Models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class imageProxy implements Element {
    Image Name;
    String name;
    public imageProxy(String name) {
        this.name=name;
    }
    @Override
    public void print() {
        if (Name==null)
            Name=new Image(name);
        Name.print();
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
        {   out.println("{");
            out.println("   \"ImageProxy\":{");
            out.println("        \"name\":"+"\""+this.name+ "\"");
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