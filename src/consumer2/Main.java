package consumer2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String>Devices = new ArrayList<>();

        Devices.add("Huawei");
        Devices.add("Iphone");
        Devices.add("Oppo");
        Devices.add("Samsung");

        Consumer<String>consumer = devices ->  System.out.println("Cell phones with best performance " + Devices );
        consumer.accept(Devices.toString());
    }
}
