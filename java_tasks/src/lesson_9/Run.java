package lesson_9;

public class Run {
    public static void main(String[] args) {
        Store coin = new Store();
        Product milk = new Product();
        Product bread = new Product();
        Product buns = new Product();
        Product garlic = new Product();
        coin.addProduct(6546, "Vodka", 7);
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
        coin.allProducts();
        coin.allProducts('+');
        coin.allProducts('-');
    }
}
