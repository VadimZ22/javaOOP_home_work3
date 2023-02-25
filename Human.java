package Home_Work3;

public abstract class Human {
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String voice(String str){
        return str;
    }
}
