package entity;

/**
 * Created by player on 2015/7/4.
 */
public class Dog {
    private String name;
    private boolean pei;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPei() {
        return pei;
    }

    public void setPei(boolean pei) {
        this.pei = pei;
    }
}
