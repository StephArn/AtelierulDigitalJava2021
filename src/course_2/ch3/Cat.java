package course_2.ch3;

public class Cat extends Animal implements Pet{

    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
    }

    @Override
    public void eat() {
        System.out.println("The cat ate a treat!");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("The cat played with a ball of yarn!");
    }
}
