package course_3.visitor;

public class PriceVisitor implements Visitor{

    private float totalPrice = 0;
    @Override
    public void visit(Video v) {
        totalPrice += v.getPrice();
    }

    @Override
    public void visit(Book b) {
        totalPrice += b.getPrice();
    }

    @Override
    public void visit(Audio a) {
        totalPrice += a.getPrice();
    }

    @Override
    public String toString() {
        return "PriceVisitor{" +
                "totalPrice=" + totalPrice +
                '}';
    }
}
