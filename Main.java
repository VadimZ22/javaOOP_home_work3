package Home_Work3;

public class Main {
    public static void main(String[] args) {

        Person grandMotherM = new Person("Алевтина", 61);
        Person grandFatherM = new Person("Иван", 63);
        Person grandMotherF = new Person("Клара", 60);
        Person grandFatherF = new Person("Иннокентий", 63);
        Person mother = new Person("Ольга", 30, grandMotherM, grandFatherM);
        Person father = new Person("Сергей", 35, grandMotherF, grandFatherF);
        Person son = new Person("Антон", 15, mother, father);
        Person son2 = new Person("Андрей", 14);
        son2.setFather(father);
        son2.setMother(mother);
        Person son3 = new Person("Bob", 12, mother, father);

        father.printInfo(father);
        son.printInfo(son);


        Closet closet = new Closet();
        Human Bob = new Person("Bob", 32);
        ((Person) Bob).printInfo((Person) Bob);
        ((Person) Bob).toInteract(Bob, closet);
        closet.print();
        ((Person) Bob).toInteract(Bob, closet);
        closet.print();



        Animal cat = new Cat("Barsik");
        ((Cat) cat).printInfo();
        ((Person) Bob).toInteract(Bob, cat);

        ((Cat) cat).print();
        ((Person) Bob).print();
    }
}


