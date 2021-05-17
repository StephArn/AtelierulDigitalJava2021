package course_2.ch2;

public class Main {
    public static void main(String[] args) {
        Actor a1 = new Actor("Jennifer", 35, new Premiu[] {new Premiu("Oscar",2020)});
        Actor a2 = new Actor("Tom", 35, null);

        Film f1 = new Film(2020, "Film de Oscar", new Actor[]{a1, a2});
        Film f2 = new Film(2021, "Film simplu", new Actor[]{a1});

        Studio s1 = new Studio("Creative", new Film[]{f1, f2, f1, f2, f1});
        Studio s2 = new Studio("First studio", new Film[]{f1, f2});

        Studio[] studios = new Studio[]{s1,s2};

        for (Studio s : studios){
            if(s.publishedMoreThan2Movies()){
                System.out.println(s);
            }
        }
    }
}
