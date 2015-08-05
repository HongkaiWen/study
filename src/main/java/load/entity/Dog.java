package load.entity;

/**
 * Created by player on 2015/7/29.
 */
public class Dog extends Annimal {
    public static FieldObject staticField = new FieldObject(Dog.class, "static");

    static {
        System.out.println(String.format("class [%s], static block init", Dog.class.getName()));
    }

    public FieldObject nonStaticField = new FieldObject(Dog.class, "non-static");

    public Dog(){
        System.out.println(String.format("class [%s], instance [%s] init", Dog.class.getName(), this));
    }
}
