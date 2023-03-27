package interfacesAndAbstractions.foodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Buyer> buyers = new HashMap<>();

        int numOfPeople = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfPeople; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Buyer buyer = input.length == 3
                    ? new Rebel(input[0])
                    : new Citizen(input[0]);

            buyers.put(input[0], buyer);
        }

        String nameOfBuyer = scanner.nextLine();

        while (!"End".equals(nameOfBuyer)) {
            Buyer buyer = buyers.get(nameOfBuyer);
            if (buyer != null) {
                buyer.buyFood();
            }

            nameOfBuyer = scanner.nextLine();
        }

        System.out.println(buyers.values().stream()
                .mapToInt(Buyer::getFood).sum());
    }
}
