package Home_Work3;

interface Printable {
    default void print (){
        System.out.println(this.toString());
    }
    default void print (String str){
        System.out.println(str);
    }
}
