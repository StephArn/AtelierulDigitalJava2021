package course_4.io;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("./src/course_4/io/input.txt");
        //System.out.println(phoneBook);

        System.out.println(phoneBook.getNumberByName("Abbey"));
        System.out.println(phoneBook.getNumberByName("Abdul"));
        System.out.println(phoneBook.getNumberByName("aaaaa"));

    }
}
