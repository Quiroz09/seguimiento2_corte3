package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> Cars = new ArrayList<>();

        Cars.add("bmw");
        Cars.add("mazda");
        Cars.add("ford");

        Consumer<String>consumer = cars -> System.out.println("these are my favorite cars " + Cars );

        consumer.accept(Cars.toString());
    }
}
