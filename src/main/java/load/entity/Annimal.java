package load.entity;

/**
 * Created by player on 2015/7/29.
 */
public class Annimal {
    public static FieldObject staticField = new FieldObject(Annimal.class, "static");

    static {
        System.out.println(String.format("class [%s], static block init", Annimal.class.getName()));
    }

    public FieldObject nonStaticField = new FieldObject(Annimal.class, "non-static");

    public Annimal(){
        System.out.println(String.format("class [%s], instance [%s] init", Annimal.class.getName(), this));
    }

}
