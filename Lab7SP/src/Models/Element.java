package Models;

public interface Element {
    void print();
    void accept(Visitor visitor);
    void tofile();
    Element getElement(int index);
    // void print();
}
