package consumer2;

public class Devices {
    private String cellPhones;

    public Devices(String cellPhones) {
        this.cellPhones = cellPhones;
    }

    public String getCellPhones() {
        return cellPhones;
    }

    public void setCellPhones(String cellPhones) {
        this.cellPhones = cellPhones;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "cellPhones='" + cellPhones + '\'' +
                '}';
    }
}
