import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean removeProduct(String productId) {
        for (Product product : products) {
            if (product.getId().equals(productId)) {
                products.remove(product);
                return true;
            }
        }
        return false;
    }

    public boolean isProductAvailable(String productId) {
        for (Product product : products) {
            if (product.getId().equals(productId) && product.getQuantity() > 0) {
                return true;
            }
        }
        return false;
    }

    public double getProductPrice(String productId) {
        for (Product product : products) {
            if (product.getId().equals(productId)) {
                return product.getPrice();
            }
        }
        return -1;
    }

    public double getProductDiscount(String productId) {
        for (Product product : products) {
            if (product.getId().equals(productId)) {
                return product.getDiscount();
            }
        }
        return -1;
    }

    public void updateStock(String productId, int newQuantity) {
        for (Product product : products) {
            if (product.getId().equals(productId)) {
                product.setQuantity(newQuantity);
                return;
            }
        }
    }

    public void updatePrice(String productId, double newPrice) {
        for (Product product : products) {
            if (product.getId().equals(productId)) {
                product.setPrice(newPrice);
                return;
            }
        }
    }

    public void updateDiscount(String productId, double newDiscount) {
        for (Product product : products) {
            if (product.getId().equals(productId)) {
                product.setDiscount(newDiscount);
                return;
            }
        }
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
