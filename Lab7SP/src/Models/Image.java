package Models;

import Services.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public class Image implements Element {
    public String imageName;


    public Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + this.imageName);
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
            out.println("      \"name\":"+"\""+this.imageName+ "\"");
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
