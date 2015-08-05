package oo;

/**
 * Created by player on 2015/7/2.
 */
public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Dog(int age, String name){
        this(name, age);
    }

    public String getIndetifer(String name, int age){
        return null;
    }

    public String getIndetifer(int age, String name){
        return null;
    }

 }
