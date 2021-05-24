package course_2.ch3;

public class TestAnimals {

    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        a.walk();
        e.walk();
        p.play();
        System.out.println(p.getName());
        p.setName("Lola");
        System.out.println(p.getName());
        p = new Fish();
        p.play();
    }
}
