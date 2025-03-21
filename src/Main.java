import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        // 1. Вычисление площади круга
        double radius = 6;
        System.out.println("Площадь круга: " + calculateCircleArea(radius));

        // 2. Перевод температуры в Цельсиях в Фаренгейты
        double celsius = 25;
        System.out.println("Температура в Фаренгейтах: " + celsiusToFahrenheit(celsius));

        // 3. Проверка равенства длины строк
        System.out.println("Длины строк равны: " + compareLengths("Hello", "World"));

        // 4. Проверка, является ли год високосным
        int year = 2024;
        System.out.printf("Год %d является високосным: %b\n", year, isLeapYear(year));

        // 5. Калькулятор ИМТ
        double weight = 70; // кг
        double height = 1.75; // м
        System.out.println("ИМТ: " + calculateBMI(weight, height));

        // 6. Таблица истинности для операторов && и ||
        printTruthTable();

        // 7. Вывод квадрата
        printSquare(5);

        // 8. Вывод полого квадрата
        printHollowSquare(5);

        // 9. Вывод ромба
        printDiamond(5);

        // 10. Вывод смайлика
        printSmiley();
    }

    // 1. Функциональность для вычисления площади круга
    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // 2. Перевод температуры из Цельсия в Фаренгейты
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // 3. Проверка равенства длины строк
    public static boolean compareLengths(String str1, String str2) {
        return str1.length() == str2.length();
    }

    // 4. Проверка, является ли год високосным
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // 5. Калькулятор ИМТ
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // 6. Таблица истинности для операторов && и ||
    public static void printTruthTable() {
        System.out.println("Таблица истинности для операторов '&&' и '||':");
        for (boolean a : new boolean[]{true, false}) {
            for (boolean b : new boolean[]{true, false}) {
                System.out.println("a = " + a + ", b = " + b + " => a && b = " + (a && b) + ", a || b = " + (a || b));
            }
        }
    }

    // 7. Вывод квадрата
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 8. Вывод полого квадрата
    public static void printHollowSquare(int size) {
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 0; j < size - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 9. Вывод ромба
    public static void printDiamond(int size) {
        // Верхняя часть ромба
        for (int i = 1; i <= size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Нижняя часть ромба
        for (int i = size - 1; i >= 1; i--) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 10. Вывод смайлика
    public static void printSmiley() {
        System.out.println("     *****   ");
        System.out.println("   *  O O  * ");
        System.out.println("  *         * ");
        System.out.println(" *     ~     * ");
        System.out.println("  *  '---'  * ");
        System.out.println("   *       *  ");
        System.out.println("     *****   ");
    }
}
