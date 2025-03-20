public class Main {
    public static void main(String[] args) {

        //1
        int age = 12;
        double wallet = 10.40;
        boolean isShoolboy = true;
        char grade = 'A';

        //2

        String name = "Иванов Иван";
        System.out.println(name);
        System.out.println(name.length());System.out.println(name.toUpperCase());
        System.out.println(name.charAt(1));

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
        /**
         * привет
         * привет
         */
        System.out.println("Привет, я " + name + "! Мне " + age + " лет.");
        System.out.printf("Привет, я %s! Мне %s лет.", name, age);

        int oddNumber = 4;
        System.out.println();
        System.out.printf("Число четное? %s", oddNumber % 2 == 0);

        System.out.println();
        System.out.println("     *    ");
        System.out.println("   * * *  ");
        System.out.println(" * * * * *");
        System.out.println("* * * * * *");
    }
}