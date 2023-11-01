package Supplice;

public class Computer {
    private String user;
    private int clue;

    public Computer(String user, int clue) {
        this.user = user;
        this.clue = clue;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getClue() {
        return clue;
    }

    public void setClue(int clue) {
        this.clue = clue;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "user='" + user + '\'' +
                ", clue=" + clue +
                '}';
    }
}
