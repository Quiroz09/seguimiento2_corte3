package Supplice;
import java.util.function.Supplier;
public class Main {
    public static void main(String[] args) {
        Supplier<Computer> User= () -> new Computer("janus",1881);
        Computer computer = User.get();
        System.out.println(" nombre: " +computer.getUser() + " Su numero de PIN es: " + computer.getClue());
    }
}
