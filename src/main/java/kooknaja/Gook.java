package kooknaja;

/**
 * Created by ratchasit.amo on 10/17/2016.
 */
public class Gook {
    private String name;
    private String last;

    public Gook(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString(){
        return "Gook{" +
                "name='" + name + '\'' +
                ", last=" + last +
                '}';
    }
}
