package lesson_9;

import java.util.*;

public class Store {
    HashMap<Integer, Product> listOfProducts = new LinkedHashMap<>();

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
            TreeSet<Product> computeThis = new TreeSet<Product>(new Comparator<Product>() {
                @Override
                public int compare(Product o2, Product o1) {
                    return o2.price - o1.price;
                }
            });
            computeThis.addAll(listOfProducts.values());
            System.out.println();
            for (Product product : computeThis) {
                System.out.print("id " + product.id +
                        " || name " + product.name +
                        " || price " + product.price + "\n");
            }
        }

        if (sorting == '-') {
            TreeSet<Product> computeThis = new TreeSet<Product>(new Comparator<Product>() {
                @Override
                public int compare(Product o2, Product o1) {
                    return o1.price - o2.price;
                }
            });
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
        String name = scan.nextLine();
        System.out.print("Цена: ");
        int price = scan.nextInt();
        if (!listOfProducts.containsKey(id)) listOfProducts.put(id, new Product(id, name, price));
    }

    void addProduct(int id, String name, int price) {
        if (!listOfProducts.containsKey(id)) listOfProducts.put(id, new Product(id, name, price));
    }

    void removeProduct() {
    }
}
