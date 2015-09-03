package load;

/**
 * Created by player on 2015/8/6.
 */
public class Dog {
    private String name = getAlias();
    private String alias = "abc";
    private String getAlias(){
        alias = "def";
        return alias;
    }
    public static void main(String args[]){
        Dog dog = new Dog();
        System.out.println(dog.name);
        System.out.println(dog.alias);
    }
}
