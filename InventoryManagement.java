import java.util.Scanner;

class Product {
    int id;
    String name;
    int quantity;

    Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product = null;
        int choice;

        do {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. View Product");
            System.out.println("3. Update Quantity");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    product = new Product(id, name, qty);
                    System.out.println("Product Added.");
                    break;

                case 2:
                    if (product != null)
                        product.display();
                    else
                        System.out.println("No Product Available.");
                    break;

                case 3:
                    if (product != null) {
                        System.out.print("Enter New Quantity: ");
                        product.quantity = sc.nextInt();
                        System.out.println("Quantity Updated.");
                    } else {
                        System.out.println("No Product Available.");
                    }
                    break;
            }

        } while (choice != 4);

        System.out.println("Inventory Closed.");
    }
}
