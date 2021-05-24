package course_2.ch3;

public class Fish extends Animal implements Pet{

    protected Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("The fish ate some flakes!");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name){};

    @Override
    public void play() {
        System.out.println("The fish swam around excitedly!");
    }

    @Override
    public void walk(){
        System.out.println("This animal can't walk as it doesn't have legs!");
    }
}
