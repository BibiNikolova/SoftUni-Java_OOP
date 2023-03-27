package encapsulation.shoppingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] buyers = scanner.nextLine().split(";");

        Map<String, Person> people = new LinkedHashMap<>();

        for (String buyer : buyers) {
            String name = buyer.split("=")[0];
            double money = Double.parseDouble(buyer.split("=")[1]);
            Person person = null;

            try {
                person = new Person(name, money);
                people.put(name, person);
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String[] purchases = scanner.nextLine().split(";");

        Map<String, Product> productMap = new LinkedHashMap<>();

        for (String purchase : purchases) {
            String productName = purchase.split("=")[0];
            double cost = Double.parseDouble(purchase.split("=")[1]);
            Product product = new Product(productName, cost);

            try {
                product = new Product(productName, cost);
                productMap.put(productName, product);

            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String order = scanner.nextLine();

        while (!"END".equals(order)) {
            String personName = order.split("\\s+")[0];
            String prodName = order.split("\\s+")[1];

            Person buyer = people.get(personName);
            Product product = productMap.get(prodName);

            try {
                buyer.buyProduct(product);
                System.out.printf("%s buy %s%n", personName, prodName);
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }

            order = scanner.nextLine();
        }

        people.values().forEach(System.out::println);


    }

}

