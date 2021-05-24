package course_3.singleton;

import course_3.singleton.LazyInit;

public class Main {
    public static void main(String[] args) {
        LazyInit li = LazyInit.getInstance();
        System.out.println(li);
        LazyInit li2 = LazyInit.getInstance();
        System.out.println(li2);
    }
}
