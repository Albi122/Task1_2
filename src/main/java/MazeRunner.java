
import java.util.Scanner;
import java.util.Random;

class MathMazeGame {
    private static final char WALL = '#';
    private static final char EMPTY = ' ';
    private static final char RUNNER = 'R';

    private static final char[][] maze = {
            {'#', '#', '#', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', '#', ' ', '#'},
            {'#', ' ', '#', ' ', '#', ' ', '#'},
            {'#', ' ', '#', ' ', ' ', ' ', '#'},
            {'#', '#', '#', '#', '#', '#', '#'}
    };

    private int x = 1;
    private int y = 1;
    private final Random random;
    private final Scanner scanner;

    public MathMazeGame() {
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    private void displayMaze() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (i == x && j == y) {
                    System.out.print(RUNNER);
                } else {
                    System.out.print(maze[i][j]);
                }
            }
            System.out.println();
        }
    }

    public void start() {
        System.out.println("Добро пожаловать в математический лабиринт!");
        System.out.println("Правила: отвечайте на математические вопросы. Правильный ответ переместит вас вправо, неверный - влево.");

        while (true) {
            displayMaze();

            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            int correctAnswer = num1 + num2;

            System.out.printf("Сколько будет %d + %d?%n", num1, num2);
            String input = scanner.nextLine();

            try {
                int playerAnswer = Integer.parseInt(input);

                if (playerAnswer == correctAnswer) {
                    y++;
                    if (y >= maze[0].length) {
                        y = 0; // Перемещение в начало строки
                    }
                    System.out.println("Правильно! Вы перемещаетесь вправо.");
                } else {
                    y--;
                    if (y < 0) {
                        y = maze[0].length - 1;
                    }
                    System.out.println("Неправильно. Вы перемещаетесь влево.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите числовой ответ.");
                continue;
            }
            System.out.printf("Ваше текущее положение: (%d, %d)%n", x, y);

            if (y == 0 || y == maze[0].length - 1) {
                System.out.println("Вы достигли края лабиринта. Игра окончена!");
                break;
            }

        }
    }

}
