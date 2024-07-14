import java.util.*;


public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Store Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Check Product Availability");
            System.out.println("4. Display Product Price");
            System.out.println("5. Display Product Discount");
            System.out.println("6. Update Stock");
            System.out.println("7. Update Price");
            System.out.println("8. Update Discount");
            System.out.println("9. Display All Products");
            System.out.println("10. Exit ");
            System.out.print("Choose an option: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        try {
                            System.out.print("Enter Product ID: ");
                            String id = scanner.next();
                            System.out.print("Enter Product Name: ");
                            String name = scanner.next();
                            System.out.print("Enter Quantity: ");
                            int quantity = scanner.nextInt();
                            System.out.print("Enter Price: ");
                            double price = scanner.nextDouble();
                            System.out.print("Enter Discount: ");
                            double discount = scanner.nextDouble();
                            store.addProduct(new Product(id, name, quantity, price, discount));
                            System.out.println("Product has been added successfully.");
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter the correct data types.");
                            scanner.nextLine();
                        }
                        break;

                    case 2:
                        System.out.print("Enter Product ID to Remove: ");
                        String removeId = scanner.next();
                        if (store.removeProduct(removeId)) {
                            System.out.println("Product with ID " + removeId + " has been removed.");
                        } else {
                            System.out.println("Product with ID " + removeId + " does not exist.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Product ID to Check Availability: ");
                        String checkId = scanner.next();
                        System.out.println(store.isProductAvailable(checkId) ? "Product is available" : "Product is not available");
                        break;

                    case 4:
                        System.out.print("Enter Product ID to Display Price: ");
                        String priceId = scanner.next();
                        System.out.println("Product Price: " + store.getProductPrice(priceId));
                        break;

                    case 5:
                        System.out.print("Enter Product ID to Display Discount: ");
                        String discountId = scanner.next();
                        System.out.println("Product Discount: " + store.getProductDiscount(discountId));
                        break;

                    case 6:
                        try {
                            System.out.print("Enter Product ID to Update Stock: ");
                            String stockId = scanner.next();
                            System.out.print("Enter New Quantity: ");
                            int newQuantity = scanner.nextInt();
                            store.updateStock(stockId, newQuantity);
                            System.out.println("Stock has been updated successfully.");
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid quantity.");
                            scanner.nextLine();
                        }
                        break;

                    case 7:
                        try {
                            System.out.print("Enter Product ID to Update Price: ");
                            String updatePriceId = scanner.next();
                            System.out.print("Enter New Price: ");
                            double newPrice = scanner.nextDouble();
                            store.updatePrice(updatePriceId, newPrice);
                            System.out.println("Price has been updated successfully.");
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid price.");
                            scanner.nextLine();
                        }
                        break;

                    case 8:
                        try {
                            System.out.print("Enter Product ID to Update Discount: ");
                            String updateDiscountId = scanner.next();
                            System.out.print("Enter New Discount: ");
                            double newDiscount = scanner.nextDouble();
                            store.updateDiscount(updateDiscountId, newDiscount);
                            System.out.println("Discount has been updated successfully.");
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid discount.");
                            scanner.nextLine();
                        }
                        break;

                    case 9:
                        store.displayProducts();
                        break;

                    case 10:
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice. Please enter a number between 1 and 10.");
                scanner.nextLine();
            }
            System.out.println();
        }


    }
}
