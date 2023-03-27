package workingWithAbstraction.pointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //[{bottomLeftX}, {bottomLeftY}, {topRightX}, {topRightY}]
        int[] coordinates = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        //[0] -> bottomLeft x
        int bottomLeftX = coordinates[0];
        //[1] -> bottomLeftY
        int bottomLeftY = coordinates[1];
        //[2] -> topRightX
        int topRightX = coordinates[2];
        //[3] -> topRightY
        int topRightY = coordinates[3];

        Point bottomLeft = new Point(bottomLeftX, bottomLeftY); //долу ляво
        Point topRight = new Point(topRightX, topRightY); //горе дясно
        Rectangle rectangle = new Rectangle(bottomLeft, topRight); //правоъгълник

        int countPoints = Integer.parseInt(scanner.nextLine()); //общ брой на проверени точки
        for (int pointCount = 1; pointCount <= countPoints; pointCount++) {
            //"0 0" -> [0, 0]
            int[] checkPointCoordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x = checkPointCoordinates[0];
            int y = checkPointCoordinates[1];
            Point searchedPoint = new Point(x, y);
            System.out.println(rectangle.contains(searchedPoint));
        }
    }
}
