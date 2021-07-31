package lesson_9;

public class Run {
    public static void main(String[] args) {
        Store coin = new Store();
       // coin.Console();
        Product milk = new Product();
        Product bread = new Product();
        Product buns = new Product();
        Product garlic = new Product();
        coin.addProduct(6546, "Vodka", 7);
        coin.addProduct(6565, "Fish", 9);
        milk.id = 6744;
        milk.name = "Milk";
        milk.price = 2;
        bread.id = 2347;
        bread.name = "Bread";
        bread.price = 1;
        buns.id = 7657;
        buns.name = "Buns";
        buns.price = 5;
        garlic.id = 7658;
        garlic.name = "Garlic";
        garlic.price = 3;
        coin.addProduct(milk);
        coin.addProduct(bread);
        coin.addProduct(buns);
        coin.addProduct(garlic);
        coin.removeProduct(6546);
        coin.removeProduct(6744);
        coin.editProduct(7658, "Onion", 4);
        coin.editProduct(7657, "Lavash", 6);
        coin.allProducts();
        coin.allProducts('+');
        coin.allProducts('-');
    }
}
