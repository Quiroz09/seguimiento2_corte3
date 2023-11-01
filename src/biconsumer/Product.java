package biconsumer;

public class Product {
    private String productType;
    private int ID;

    public Product(String productType, int ID) {
        this.productType = productType;
        this.ID = ID;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productType='" + productType + '\'' +
                ", ID=" + ID +
                '}';
    }
}
