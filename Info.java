package Home_Work3;

import java.io.FileWriter;
import java.io.IOException;

interface Info extends Printable {

    default void printInfo(Person p){

        try {
            print(p.toString());
        }
        catch (NullPointerException e){};

        try {
            print("Mother "+p.getMother().toString());
        }
        catch (NullPointerException e){}

        try {
            print("Father "+p.getFather().toString());
        }
        catch (NullPointerException e){}

        try {
            print("Grandmother "+p.getMother().getMother().toString());
        }
        catch (NullPointerException e){}

        try {
            print("Grandmother "+p.getFather().getMother().toString());
        }
        catch (NullPointerException e){}

        try {
            print("Grandfather "+p.getFather().getFather().toString());
        }
        catch (NullPointerException e){}

        try {
            print("Grandfather "+p.getMother().getFather().toString());
        }
        catch (NullPointerException e){}


        if (p.getChildren().size()>0){
            print("Children:");
            for (Person h: p.getChildren()){
                print(h.toString());
            }
        }

        if (p.getSisAndBro().size()>0){
            print("Sisters and Brothers:");
            for (Person h : p.getSisAndBro()){
                print(h.toString());
            }
        }

    }

    default void toFile(Person p){
        try {
            FileWriter writer = new FileWriter("File.txt", true);
            writer.write(p.toString());
            writer.write("\nMother "+p.getMother().toString());
            writer.write("\nFather "+p.getFather().toString());
            writer.write("\nGrandmother "+p.getMother().getMother().toString());
            writer.write("\nGrandmother "+p.getFather().getMother().toString());
            writer.write("\nGrandfather "+p.getFather().getFather().toString());
            writer.write("\nGrandfather "+p.getMother().getFather().toString());

            writer.write("\nChildren:");
            for (Person h : p.getChildren()){
                writer.write("\n"+h.toString());
            }
            writer.write("\nSisters and Brothers:");
            for (Person h : p.getSisAndBro()){
                writer.write("\n"+h.toString());
            }
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
