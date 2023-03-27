package workingWithAbstraction.trafficLights;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] signals = scanner.nextLine().split("\\s+");
        int iterations = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLightList = Arrays.stream(signals)
                .map(Color::valueOf)
                .map(TrafficLight::new)
                .collect(Collectors.toList());


        for (int i = 0; i < iterations ; i++) {
            for (TrafficLight light : trafficLightList) {
                light.changeColor();
                System.out.print(light.getColor() + " ");
            }
            System.out.println();
        }

    }
}
