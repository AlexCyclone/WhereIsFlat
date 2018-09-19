package icu.cyclone.alex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repeat = "y";
        while (repeat.equals("y")) {
            System.out.println(flatData(readNumber(), 4, 9, 4));
            System.out.print("Try again(y/n): ");
            repeat = sc.next();
        }
    }

    public static int readNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type flat number: ");
        return sc.nextInt();
    }

    public static String flatData(int number, int flats, int floors, int entrances) {
        if (number < 1 || number > flats * floors * entrances) {
            return "Nowhere";
        }
        number = (number - 1) / (flats);
        return "Entrance: " + (number / floors + 1) + ", Floors: " + (number % floors + 1);
    }
}
