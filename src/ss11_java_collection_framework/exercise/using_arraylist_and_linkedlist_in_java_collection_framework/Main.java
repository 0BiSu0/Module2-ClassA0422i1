package ss11_java_collection_framework.exercise.using_arraylist_and_linkedlist_in_java_collection_framework;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> listItem = new ArrayList<>();
        ProductManager productManager = new ProductManager(listItem);
        int choose = -1;
        do {
            System.out.println("Menu\n" + "1.Add New Product\n" + "2.Remove Product By ID\n" + "3.Display Product\n " + "4.Search Product By ID\n " + "5.Edit Product\n" + "6.Read File\n" + "7.Write Product File\n" + "8.Exit");
            System.out.println("Enter your choose: ");
            choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                    System.out.println("Product Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Product ID: ");
                    int id = (scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Product Price: ");
                    int price = (scanner.nextInt());
                    Product product = new Product(id, name, price);
                    productManager.addProduct(product);
                    break;
                case 2:
                    productManager.removeProduct();
                    break;
                case 3:
                    productManager.displayProduct();
                    break;
                case 4:
                    productManager.searchProduct();
                    break;
                case 5:
                    productManager.editProduct();
                    break;
                case 6:
                    productManager.readFileProduct();
                case 7:
                    productManager.writeFileProduct();
                case 8:
                    System.exit(0);

            }

        }while (true);
    }
}

