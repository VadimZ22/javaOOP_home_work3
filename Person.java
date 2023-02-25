package Home_Work3;

import java.util.ArrayList;
import java.util.Objects;

public class Person extends Human implements Info, Validator, Interactive {

    private Person mother;
    private Person father;
    private final ArrayList<Person> children = new ArrayList<>();
    private final ArrayList<Person> sisAndBro = new ArrayList<>();


    public Person(String name, int age, Person mother, Person father) {
        super(name, age);
        if (age <= 0) super.age = 1;
        if (mother != null) setMother(mother);
        if (father != null) setFather(father);
    }


    public Person(String name, int age) {
       this(name, age, null, null);
    }


    public ArrayList<Person> getSisAndBro() {
        return sisAndBro;
    }

    public void setSisAndBro(Person sisAndBro) {
        if (!this.sisAndBro.contains(sisAndBro) && !sisAndBro.equals(this)) {
            this.sisAndBro.add(sisAndBro);
        }
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setChildren(Person children) {
        this.children.add(children);
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = this.ancestorSet(this, mother);
            mother.setChildren(this);
            for (Person p : mother.getChildren()){
                this.setSisAndBro(p);
                p.setSisAndBro(this);
            }
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = ancestorSet(this, father);
            father.setChildren(this);
            for (Person p : father.getChildren()){
                this.setSisAndBro(p);
                p.setSisAndBro(this);
            }
    }


    @Override
    public String toString() {
        return "name: " + name + '\n' +
               "age: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }


}
