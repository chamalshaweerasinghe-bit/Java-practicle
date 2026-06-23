class Product {
    int productId;
    String productName;
    double unitPrice;

    // a. Non-parameterized constructor (default values)
    Product() {
        productId = 0;
        productName = "Unknown";
        unitPrice = 0.0;
    }

    // b. Parameterized constructor
    Product(int id, String name, double price) {
        productId = id;
        productName = name;
        unitPrice = price;
    }

    // c. Apply discount method
    void applyDiscount(double percentage) {
        unitPrice = unitPrice - (unitPrice * percentage / 100);
        System.out.println("Updated Price after discount: Rs. " + unitPrice);
    }

    // d. Get product label method
    String getProductLabel() {
        return productId + " - " + productName + " - Rs. " + unitPrice;
    }

    // e. Main method
    public static void main(String[] args) {

        // Object using default constructor
        Product p1 = new Product();

        // Object using parameterized constructor
        Product p2 = new Product(101, "Laptop", 150000);

        // Apply 15% discount on p2
        p2.applyDiscount(15);

        // Print product labels
        System.out.println("Product 1: " + p1.getProductLabel());
        System.out.println("Product 2: " + p2.getProductLabel());
    }
}