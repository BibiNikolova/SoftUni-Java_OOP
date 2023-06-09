package inheritance;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        inheritance.Dog dog = new inheritance.Dog();
//        dog.eat();
//        dog.bark();
//
//        inheritance.Cat cat = new inheritance.Cat();
//        cat.eat();
//        cat.meow();

//        inheritance.RandomArrayList list = new inheritance.RandomArrayList();
//
//        list.add(13);
//        list.add(42);
//        list.add(73);
//        list.add(69);
//        list.add(51);
//
//        System.out.println(list.getRandomElement());

        Reader reader = new Reader(System.in);

        System.out.println(Arrays.toString(reader.readIntArray("\\s+")));

        MyStack strings = new MyStack();

        strings.push("my-solution");
        System.out.println(strings.pop());

    }
}
