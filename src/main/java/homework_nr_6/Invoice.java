package homework_nr_6;

public class Invoice {

    private String deviceModel;

    private String productDescription;

    private int numberOfOfferedProducts;

    private double productPrice;

    public Invoice(String deviceModel, String productDescription, int numberOfOfferedProducts, double productPrice) {
        this.deviceModel = deviceModel;
        this.productDescription = productDescription;
        if (numberOfOfferedProducts<1){
            this.numberOfOfferedProducts=0;
        } else {
            this.numberOfOfferedProducts = numberOfOfferedProducts;
        }
        if (productPrice<1){
            this.productPrice=0;
        } else {
            this.productPrice = productPrice;
        }
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setNumberOfOfferedProducts(int numberOfOfferedProducts) {
        if (numberOfOfferedProducts<1){
            this.numberOfOfferedProducts=0;
        } else {
            this.numberOfOfferedProducts = numberOfOfferedProducts;
        }
    }

    public void setProductPrice(double productPrice) {
        if (productPrice<1){
            this.productPrice=0;
        } else {
            this.productPrice = productPrice;
        }
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getNumberOfOfferedProducts() {
        return numberOfOfferedProducts;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public double getAmount(){
        return productPrice*numberOfOfferedProducts;
    }
}