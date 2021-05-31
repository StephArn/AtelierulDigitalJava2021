package course_4.exceptions;

public class CheckedException extends Exception{
    public CheckedException() {
        super("You inserted 0 and that is not allowed here.");
    }
}
