package course_5.ch1;

public abstract class Currency {
    private float value;
    private String name;

    public Currency() { }

    public Currency(float value, String name) {
        this.value = value;
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public void setValue(float value) {
        this.value = value;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
