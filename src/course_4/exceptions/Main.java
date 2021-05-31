package course_4.exceptions;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.calculate(4);
        System.out.println(c.calculate(0));
    }
}
