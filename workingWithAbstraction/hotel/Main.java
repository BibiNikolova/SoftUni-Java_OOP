package workingWithAbstraction.hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"{pricePerDay} {numberOfDays} {season} {discountType}"
        String input = scanner.nextLine();
        String [] splittedInput = input.split("\\s+");

        //["{pricePerDay}", "{numberOfDays}", "{season}", "{discountType}"]
        double pricePerDay = Double.parseDouble(splittedInput[0]);
        int numberOfDays = Integer.parseInt(splittedInput[1]);
        Season season = Season.valueOf(splittedInput[2].toUpperCase()); //"Summer" -> "SUMMER"
        DiscountType discountType = DiscountType.valueOf(splittedInput[3].toUpperCase()); //"SecondVisit" -> "SECONDVISIT"

        double holidayPrice = PriceCalculator.calculateHolidayPrice(pricePerDay, numberOfDays, season, discountType);

        System.out.printf("%.2f", holidayPrice);

    }
}

