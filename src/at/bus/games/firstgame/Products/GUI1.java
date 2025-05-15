package at.bus.games.firstgame.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GUI1 implements GUI{
    private Scanner scanner = new Scanner(System.in);
    private List<Product> products = new ArrayList<>();

    @Override
    public void start() {
        while(true) {
            System.out.println("1 show Products");
            int selection = scanner.nextInt();

            if (selection == 1) {
                for (Product product : this.products) {
                    System.out.println(product.getID());
                }
                System.out.println("1 pressed");
            }

        }
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }
}
