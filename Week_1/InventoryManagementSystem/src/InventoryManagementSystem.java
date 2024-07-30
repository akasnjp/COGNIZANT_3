public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("1", "Laptop", 10, 999.99);
        Product product2 = new Product("2", "Smartphone", 20, 599.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);

        System.out.println("All Products:");
        inventory.displayProducts();

        Product updatedProduct1 = new Product("1", "Laptop", 15, 949.99);
        inventory.updateProduct(updatedProduct1);

        System.out.println("\nAfter Updating Product 1:");
        inventory.displayProducts();

        inventory.deleteProduct("2");

        System.out.println("\nAfter Deleting Product 2:");
        inventory.displayProducts();
    }
}
