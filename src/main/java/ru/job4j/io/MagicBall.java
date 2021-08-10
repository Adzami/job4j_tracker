package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? \n");
        String  input = new Scanner(System.in).nextLine();
        // Я ж великий оракул - так что на одинаковый вопрос даю одинаковый ответ.
        int answer = new Random(input.hashCode()).nextInt(3);
        System.out.println(answer);
        switch (answer) {
            case 0 -> System.out.println("Да");
            case 1 -> System.out.println("Нет");
            default -> System.out.println("Может быть");
        }
    }
}
