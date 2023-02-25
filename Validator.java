package Home_Work3;

interface Validator extends Printable {

    default Person ancestorSet(Person p, Person ancestor) {

        if (ancestor.age <= p.getAge()){
            print("Error!");
            return null;
        }
        else return ancestor;
    }
}

