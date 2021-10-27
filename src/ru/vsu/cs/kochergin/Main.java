package ru.vsu.cs.kochergin;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        int height = readSize("height");
        int width = readSize("width");

        printFigure(height, width);
    }

    public static int readSize(String nameSize) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input %s: ", nameSize);

        int size = checkIntNumber(nameSize);

        while (!checkCorrectNumber(size)) {
            System.out.printf("Incorrect data, %s must be >= 1%n", nameSize);
            System.out.printf("Input %s: ", nameSize);

            size = checkIntNumber(nameSize);
        }

        return size;
    }

    public static int checkIntNumber(String nameSize) {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Incorrect data, please input int number");
            System.out.printf("Input %s: ", nameSize);
            scanner.next();
        }

        return scanner.nextInt();
    }

    public static boolean checkCorrectNumber(int size) {
        if (size >= 1) {
            return true;
        }
        return false;
    }

    public static void printFigure(int h, int w) {
        for (int repeat = h; h >= 1; repeat--) {
            for (int weight = w; weight >= 1;) {
                for (char ch = 'a'; ch <= 'b'; ch++) {
                    for (int k = 0; k < repeat; k++) {

                        if (weight == 0) {
                            break;
                        }

                        System.out.print(ch);
                        weight--;
                    }
                }

            }
            System.out.println();
        }
    }
}
