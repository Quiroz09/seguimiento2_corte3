package biconsumer;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("sal", 123);
        Customer customer = new Customer("marleny",1904897);

        BiFunction<Product,Customer,String> Product=(P, C) ->{
            return C.getName()  + "buy " + P.getProductType() + "with product id " + P.getID() + "with your ID  " + C.getIdentificationCar();
        };
        System.out.println(Product.apply(product,customer));
    }

}
