package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Читання кількості записів
        int n = scanner.nextInt();

        // Створення мапи для збереження сумарного часу за кожну гру
        Map<Integer, Integer> gamesTime = new HashMap<>();

        // Зчитування записів щоденника і оновлення сумарного часу за кожну гру
        for (int i = 0; i < n; i++) {
            int gameNumber = scanner.nextInt();
            int gameTime = scanner.nextInt();

            // Оновлення сумарного часу за гру в мапі
            gamesTime.put(gameNumber, gamesTime.getOrDefault(gameNumber, 0) + gameTime);
        }

        // Пошук гри з найбільшим сумарним часом
        int favoriteGame = -1;
        int maxTime = 0;
        for (Map.Entry<Integer, Integer> entry : gamesTime.entrySet()) {
            int gameNumber = entry.getKey();
            int gameTime = entry.getValue();

            // Порівняння з попереднім максимальним часом
            if (gameTime > maxTime) {
                favoriteGame = gameNumber;
                maxTime = gameTime;
            }
        }

        // Виведення номера улюбленої гри
        System.out.println(favoriteGame);

    }
}