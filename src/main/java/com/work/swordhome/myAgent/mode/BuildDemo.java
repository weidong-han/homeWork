package com.work.swordhome.myAgent.mode;

/**
 * @auther: weidong.han
 * @date: 2019/12/20
 */
public class BuildDemo {

    public static void main(String[] args) {
        Builed builed  = new Builed();
        builed.builderName("weidong.han");
        builed.builderage(31);
        Statuds statuds = builed.buil();
        System.out.println(statuds.tostring());
    }
}

class Statuds {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String tostring(){
        return this.getName() + this.getAge();
    }

}

class Builed{

    private Statuds statuds;

    public Builed(){
        statuds = new Statuds();
    }

    public void builderName(String name){
        statuds.setName(name);
    }
    public void builderage(int age){
        statuds.setAge(age);
    }

    public Statuds buil(){
        return statuds;
    }
}