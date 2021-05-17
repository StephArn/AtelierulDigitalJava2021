package course_2.ch2;

import java.util.Arrays;

public class Studio {

    private String nume;
    private Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public String getNume() {
        return nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    public boolean publishedMoreThan2Movies(){
        return filme.length >2;
    }

    public boolean hasCertainActor(String actorName){
        for(Film f:filme){
            if(f.hasActorWithName(actorName)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return nume;
    }
}
