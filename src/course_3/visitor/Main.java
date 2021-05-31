package course_3.visitor;

public class Main {
    public static void main(String[] args) {
        Element [] elements = new Element[]{
                new Book("Book Title",100,10.3f),
                new Audio("Song Title", 3.5f, 15),
                new Video(10,15,"Video Title" )
        };

        PriceVisitor priceVisitor = new PriceVisitor();

        for(Element currentElement:elements){
            currentElement.accept(priceVisitor);
        }

        System.out.println(priceVisitor);

        DurationVisitor durationVisitor = new DurationVisitor();

        for (Element current:elements) {
            current.accept(durationVisitor);
        }

        System.out.println(durationVisitor);
    }
}
