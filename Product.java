public class Product {
    private String id;
    private String name;
    private int quantity;
    private double price;
    private double discount;

    public Product(String id, String name, int quantity, double price, double discount) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public String getId() {
        return id;
    }


    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }


    public double getDiscount() {
        return discount;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{id='" + id + "', name='" + name + "', quantity=" + quantity +
                ", price=" + price + ", discount=" + discount + "}";
    }
}
