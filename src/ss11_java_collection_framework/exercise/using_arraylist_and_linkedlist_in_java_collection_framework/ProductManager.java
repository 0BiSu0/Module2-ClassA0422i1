package ss11_java_collection_framework.exercise.using_arraylist_and_linkedlist_in_java_collection_framework;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class ProductManager extends Product{
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Product> listItem = new ArrayList<>();
    static String filename = "src\\ss11_java_collection_framework\\exercise\\using_arraylist_and_linkedlist_in_java_collection_framework\\ProductFile.csv";
    static final String COMMA_DELIMITER = ",";
    static String empty = "empty";
    public ProductManager(ArrayList<Product> listItem){
     super();
        this.listItem = listItem;
    }

    public void addProduct(Product product){
        this.listItem.add(product);
    }



    public void removeProduct(){
        System.out.println("Enter id Product to Remove: ");
        int idProduct = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < listItem.size(); i++) {
            if (listItem.get(i).getId() == idProduct) {
                this.listItem.remove(i);
                System.out.println("Product has been remove!!!");
                break;
            } else {
                System.out.println("Product ID not exist!!!");
            }
        }
    }




    public void editProduct(){
        System.out.println("Enter ID Product You want to edit: ");
        int idProduct = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < listItem.size(); i++){
            if (listItem.get(i).getId() == idProduct){
                System.out.println("Enter New Name Product: ");
                listItem.get(i).setName(scanner.nextLine());
                System.out.println("Enter New Price: ");
                listItem.get(i).setPrice(scanner.nextInt());
                System.out.println("Enter new ID: ");
                listItem.get(i).setId(scanner.nextInt());
                break;
            }else {
               System.out.println("ID is not Available!!!");
            }
        }
    }




    public void displayProduct(){
        for (int i = 0; i < listItem.size(); i ++ ){
            System.out.println("-------------------------");
            System.out.println("STT: "+ (i + 1));
            System.out.println("ID: " + listItem.get(i).getId());
            System.out.println("Name: "+listItem.get(i).getName());
            System.out.println("Price:" + listItem.get(i).getPrice());
            System.out.println("--------------------------");

        }
    }
    public Product searchProductById(int id){
        return listItem.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }
    public Product searchProductByName(String name){
        return listItem.stream().filter(x->x.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
    public void setNewValue(int id, String name, int price) {
        this.searchProductById(id).setName(name);
        this.searchProductById(id).setPrice(price);
    }

    public void searchProduct() {
        int choose;
        do {
            System.out.println("1.Search Product By ID\n" + "2.Search Product By Name");
            System.out.println("Enter your choice: ");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("Enter Product ID: ");
                    int id = scanner.nextInt();
                    if (searchProductById(id) == null) {
                        System.out.println("ID does not exist!!!");
                    } else {
                        System.out.println(searchProductById(id).toString());
                    }

                    break;
                case 2:
                    System.out.println("Enter Product Name: ");
                    String name = scanner.nextLine();
                    if (searchProductByName(name) == null) {
                        System.out.println("Name does not exist!!!");
                    } else {
                        System.out.println(searchProductByName(name).toString());
                    }
            }
        }while (true);
    }


    public void readFileProduct(){
        File file = new File(filename);
        if (file.length() == 0) return;
        boolean flag = true;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = bufferedReader.readLine()) != null){
                if (line.trim().isEmpty()) continue;
                if (flag){
                    flag = false;
                    continue;
                }
                String[] currentArray = line.split(COMMA_DELIMITER);
                String check = currentArray[currentArray.length - 1];
                List<String> production = new ArrayList<>();
                for (String element : currentArray) {
                    if (element.equalsIgnoreCase(empty)) {
                        continue;
                    }

                    production.add(element);
                }

                if (!check.equals("empty!!!")) {
                    addProduct(new Product(production));
                }
                }
            } catch (IOException e) {
                System.out.println("FILE NOT FOUND!!!");
            }
            listItem.sort(Comparator.comparing(Product::getName));
        }


        public void writeFileProduct(){
        File file = new File(filename);
        if (file.length() == 0) return;
        try {
            FileWriter writer = new FileWriter("ProductFile.csv", true);
            writer.write(String.valueOf(listItem));
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        }
    }


