package Home_Work3;

interface Interactive extends Printable {
    default void toInteract(Human h, Animal a){
        if (a.kind.equals("Cat")) {
            print("mmrrrrrrrrr");
        }
    }
    default void toInteract(Human h, Closet c){
        if (c.getState() == Closet.State.Close){
            c.setState(Closet.State.Open);
        }
        else c.setState(Closet.State.Close);
    }
}
