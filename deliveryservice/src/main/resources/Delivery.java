public class Delivery {
    String status;
    Packaging packaging;

    public String getStatus() {
        return status;
    }

    public void deliverThePackage() {
        status = "Delivered";
    }
}
