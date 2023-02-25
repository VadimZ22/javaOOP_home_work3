package Home_Work3;

public class Closet implements Printable {
    int length;
    int width;
    int height;
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Closet() {
        this.state = State.Close;
    }
    enum State {
        Open, Close
    }

    @Override
    public String toString() {
        if (this.state == State.Open){
            return "Closet state: Open";
        }
        else{
            return "Closet state: Close";
        }
    }
}
