package Home_Work3;

import java.io.FileWriter;
import java.io.IOException;

public class Cat extends Animal implements Info {
    String name;

    public Cat(String name) {
        super("Cat");
        this.name = name;
    }

    public void printInfo() {
        print(this.toString());;
    }

    public void toFile() {
        try {
            FileWriter writer = new FileWriter("Cats.txt", true);
            writer.write(this.toString());
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return super.kind +" "+ name;
    }
}
