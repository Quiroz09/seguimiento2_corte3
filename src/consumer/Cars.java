package consumer;

public class Cars {
    private String TypesOfCars;

    public Cars(String typesOfCars) {
        TypesOfCars = typesOfCars;
    }

    public String getTypesOfCars() {
        return TypesOfCars;
    }

    public void setTypesOfCars(String typesOfCars) {
        TypesOfCars = typesOfCars;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "TypesOfCars='" + TypesOfCars + '\'' +
                '}';
    }
}
