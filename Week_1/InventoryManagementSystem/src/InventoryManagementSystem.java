public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding products
        Product product1 = new Product("1", "Laptop", 10, 999.99);
        Product product2 = new Product("2", "Smartphone", 20, 599.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Displaying all products
        System.out.println("All Products:");
        inventory.displayProducts();

        // Updating a product
        Product updatedProduct1 = new Product("1", "Laptop", 15, 949.99);
        inventory.updateProduct(updatedProduct1);

        // Displaying all products after update
        System.out.println("\nAfter Updating Product 1:");
        inventory.displayProducts();

        // Deleting a product
        inventory.deleteProduct("2");

        // Displaying all products after deletion
        System.out.println("\nAfter Deleting Product 2:");
        inventory.displayProducts();
    }
}
