package load.entity;

/**
 * Created by vincent on 2015/7/29.
 */
public class FieldObject {

    public FieldObject(Class obj, String staticOrNot){
        System.out.println(String.format("class [%s], %s field init", obj.getName(), staticOrNot));
    }

}
