public class Main {
    public static void main(String[] args) {

        //1
        int age = 14;
        double wallet = 10.40;
        char grade = 'A';
        double averageScore = 4.8; // Средний балл
        boolean isExcellent = averageScore >= 4.5; // Отличник или нет
        boolean likesMath = true; // Любит ли ученик математику?

        //2

        String name = "Александр Невский";
        System.out.println(name);
        System.out.println(name.length());System.out.println(name.toUpperCase());
        System.out.println(name.charAt(1));
        System.out.println("Средний балл: " + averageScore);
        System.out.println("Отличник: " + isExcellent);
        System.out.println("Любит математику: " + (likesMath ? "Да" : "Нет"));

        // 3
        System.out.println(10 + 15);
        System.out.println(10 - 2);
        System.out.println(2 * 2);
        System.out.println(10 / 5);

        System.out.println(10 / 3);
        System.out.println(10.0 / 3.0);

        System.out.println(10 % 3);

        System.out.println("a" + "b");

        // 4
        System.out.println(1 > 2);
        System.out.println(2 == 2);
        System.out.println(2 >= 2);
        System.out.println(3 != 3);

        // 5
        System.out.println(2 == 2 && 3 != 2); // true && true -> true
        System.out.println(2 == 2 && 3 != 3); // true && false -> false
        System.out.println(!((2 + 2) == 4)); // !(4 == 4) -> !(true) -> false
        System.out.println(!((2 + 2) == 4) || true); // false || true -> true

        // 6
        System.out.println("Привет, я " + name + "! Мне " + age + " лет.");
        System.out.printf("Привет, я %s! Мне %s лет.", name, age);

        int oddNumber = 4;
        System.out.println();
        System.out.printf("Число четное? %s", true);

        System.out.println();
        System.out.println("     *    ");
        System.out.println("   * * *  ");
        System.out.println(" * * * * *");
        System.out.println("* * * * * *");
    }
}