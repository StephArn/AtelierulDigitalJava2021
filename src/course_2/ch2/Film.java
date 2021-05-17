package course_2.ch2;

public class Film {
    private Integer anAparitie;
    private String nume;
    private Actor[] actori;

    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public String getNume() {
        return nume;
    }

    public Actor[] getActori() {
        return actori;
    }

    public boolean hasActorAbove50(){
        for(Actor a:actori){
            if(a.getVarsta() > 50){
                return true;
            }
        }
        return false;
    }

    public boolean hasActorWithName(String actorName)
    {
        for(Actor a:actori){
            if(a.getNume().equals(actorName)){
                return true;
            }
        }
        return false;
    }
}
