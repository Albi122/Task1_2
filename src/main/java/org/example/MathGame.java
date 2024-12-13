package org.example;
import java.util.Scanner;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class MathGame {
    private int position;
    private int attempts;

    public MathGame(int maxAttempts) {
        this.position = 0;
        this.attempts = maxAttempts;
    }

    public boolean askQuestion() {
        Random rand = new Random();
        int num1 = rand.nextInt(10) + 1;
        int num2 = rand.nextInt(10) + 1;
        char operation = rand.nextBoolean() ? '+' : '-';
        int answer = (operation == '+') ? num1 + num2 : num1 - num2;

        System.out.println("Вопрос: " + num1 + " " + operation + " " + num2 + " = ?");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ваш ответ: ");
        int playerAnswer = scanner.nextInt();

        position += (playerAnswer == answer) ? 1 : -1;
        attempts--;

        System.out.println("Ваше положение: " + position);
        System.out.println("Оставшиеся попытки: " + attempts);

        return attempts > 0;
    }

    public void startGame() {
        System.out.println("Добро пожаловать в лабиринт с математическими вопросами!");

        while (attempts > 0 && askQuestion()) {
        }

        if (attempts <= 0) {
            System.out.println("У вас закончились попытки! Игра завершена.");
        }

        System.out.println("Спасибо за игру!");
    }
}
