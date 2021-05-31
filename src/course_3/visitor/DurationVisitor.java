package course_3.visitor;

public class DurationVisitor implements Visitor{

    private float totalMinutes = 0;

    @Override
    public void visit(Video v) {
        totalMinutes +=v.getMinutes();
    }

    @Override
    public void visit(Book b) {
        totalMinutes += b.getNumberOfPages()*4;
    }

    @Override
    public void visit(Audio a) {
        totalMinutes +=a.getMinutes();
    }

    @Override
    public String toString() {
        return "DurationVisitor{" +
                "totalMinutes=" + totalMinutes +
                '}';
    }
}
