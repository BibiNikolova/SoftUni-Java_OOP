package polymorphism.wildFarm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        String input = scanner.nextLine();

        while (!"End".equals(input)) {

            Animal animal = getAnimal(input);

            input = scanner.nextLine();

            Food food = getFood(input);

            animals.add(animal);

            animal.makeSound();

            animal.eatFood(food);

            input = scanner.nextLine();
        }
        animals.stream().forEach(System.out::println);
    }

    private static Food getFood(String input) {
        String[] foodTokens = input.split("\\s+");
        String foodType = foodTokens[0];
        Integer foodQuantity = Integer.parseInt(foodTokens[1]);

        return foodType.equals("Meat")
                ? new Meat(foodQuantity)
                : new Vegetable(foodQuantity);

    }

    public static Animal getAnimal(String input) {
        String[] animalTokens = input.split("\\s+");
        String animalType = animalTokens[0];
        String animalName = animalTokens[1];
        Double animalWeight = Double.parseDouble(animalTokens[2]);
        String livingRegion = animalTokens[3];

        switch (animalType) {
            case "Cat":
                return new Cat(animalName, animalType, animalWeight, livingRegion, animalTokens[4]);
            case "Tiger":
                return new Tiger(animalName, animalType, animalWeight, livingRegion);
            case "Zebra":
                return new Zebra(animalName, animalType, animalWeight, livingRegion);
            case "Mouse":
                return new Mouse(animalName, animalType, animalWeight, livingRegion);
            default:
                throw new IllegalArgumentException("Invalid animal type");
        }
    }
}
