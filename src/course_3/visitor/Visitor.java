package course_3.visitor;

public interface Visitor {
    void visit(Video v);
    void visit(Book b);
    void visit(Audio a);
}
