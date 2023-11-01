package biconsumer;

public class Customer {
    private String name;
    private int identificationCard;

    public Customer(String name, int identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(int identificationCard) {
        this.identificationCard = identificationCard;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", identificationCard=" + identificationCard +
                '}';
    }
}
