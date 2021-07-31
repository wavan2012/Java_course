package lesson_9;

import java.util.*;

public class Store {
    HashMap<Integer, Product> listOfProducts = new LinkedHashMap<>();

    void Console() {
        System.out.println("Добро пожаловать в магазин {(0)_(0)}");
        while (true) {
            System.out.print("Напишите команду: ");
            Scanner scan = new Scanner(System.in);
            String command = scan.nextLine();
            if (command.equals("stop")) break;
            if (command.equals("allprod")) allProducts();
            if (command.equals("allprod+")) allProducts('+');
            if (command.equals("allprod-")) allProducts('-');
            if (command.equals("addprod")) addProduct();
            if (command.equals("rmprod")) removeProduct();
            if (command.equals("edprod")) editProduct();
        }
    }

    void allProducts() {
        System.out.println();
        for (Map.Entry<Integer, Product> entry : listOfProducts.entrySet()) {
            System.out.print("id " + listOfProducts.get(entry.getKey()).id +
                    " || name " + listOfProducts.get(entry.getKey()).name +
                    " || price " + listOfProducts.get(entry.getKey()).price + "\n");
        }

    }

    void allProducts(char sorting) {
        if (sorting == '+') {
            TreeSet<Product> computeThis = new TreeSet<>(Comparator.comparingInt(o2 -> o2.price));
            computeThis.addAll(listOfProducts.values());
            System.out.println();
            for (Product product : computeThis) {
                System.out.print("id " + product.id +
                        " || name " + product.name +
                        " || price " + product.price + "\n");
            }
        }

        if (sorting == '-') {
            TreeSet<Product> computeThis = new TreeSet<>((o2, o1) -> o1.price - o2.price);
            computeThis.addAll(listOfProducts.values());
            System.out.println();
            for (Product product : computeThis) {
                System.out.print("id " + product.id +
                        " || name " + product.name +
                        " || price " + product.price + "\n");
            }
        }
    }

    void addProduct(Product prod) {
        if (!listOfProducts.containsKey(prod.id)) listOfProducts.put(prod.id, prod);
    }

    void addProduct() {
        Scanner scan = new Scanner(System.in);
        System.out.print("id: ");
        int id = scan.nextInt();
        System.out.print("Имя товара: ");
        String name = scan.next();
        System.out.print("Цена: ");
        int price = scan.nextInt();
        if (!listOfProducts.containsKey(id)) listOfProducts.put(id, new Product(id, name, price));
    }

    void addProduct(int id, String name, int price) {
        if (!listOfProducts.containsKey(id)) listOfProducts.put(id, new Product(id, name, price));
    }

    void removeProduct() {
        Scanner scan = new Scanner(System.in);
        System.out.print("id: ");
        int id = scan.nextInt();
        listOfProducts.remove(id);
    }

    void removeProduct(int id) {
        listOfProducts.remove(id);
    }

    void editProduct() {
        Scanner scan = new Scanner(System.in);
        System.out.print("id: ");
        int id = scan.nextInt();
        System.out.print("Имя товара: ");
        String name = scan.next();
        System.out.print("Цена: ");
        int price = scan.nextInt();
        if (listOfProducts.containsKey(id)) {
            listOfProducts.remove(id);
            listOfProducts.put(id, new Product(id, name, price));
        }
    }

    void editProduct(int id, String name, int price) {
        if (listOfProducts.containsKey(id)) {
            listOfProducts.remove(id);
            listOfProducts.put(id, new Product(id, name, price));
        }
    }
}
