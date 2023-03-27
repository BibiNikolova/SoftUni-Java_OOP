package workingWithAbstraction.cardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ranks rank = Ranks.valueOf(scanner.nextLine());

        Suits card = Suits.valueOf(scanner.nextLine());

        int sum = card.getPower() + rank.getRankPower();

        System.out.printf("Card name: %s of %s; Card power: %d", rank, card, sum);
    }
}
