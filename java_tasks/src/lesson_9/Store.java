package lesson_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    Map<Integer, Product> listOfProducts = new HashMap();

    void addProduct(Product prod) {
        listOfProducts.keySet();
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

    void allProducts() {
        listOfProducts.keySet();
        for (Map.Entry<Integer, Product> entry : listOfProducts.entrySet()) {
            System.out.print("id " + listOfProducts.get(entry.getKey()).id +
                    " || name " + listOfProducts.get(entry.getKey()).name +
                    " || price " + listOfProducts.get(entry.getKey()).price + "\n");
        }
    }

}
