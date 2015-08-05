package vincent.entity;

import java.io.Serializable;

/**
 * Created by player on 2015/6/29.
 */
public class Student implements Serializable{


    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
