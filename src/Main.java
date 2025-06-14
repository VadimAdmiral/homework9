import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1;
        System.out.println("задача1");
        int[] payments = {12500, 10000, 9550, 12000, 99000};
        int summaTrate = 0;
        for (int vyplota : payments) {
            summaTrate += vyplota;
        }
        System.out.println("Сумма трат за месяц составила " + summaTrate + "рублей");

        // Задача 2;
        System.out.println("задача2");
        int[] payments1 = Arrays.copyOf(payments, payments.length);
        Arrays.sort( payments1);
        int maxExpenses = payments1[payments1.length - 1];
        int minExpenses = payments1[0];
        System.out.println("Минимальная сумма трат за неделю составила" + minExpenses + " рублей. Максимальная сумма трат за неделю составила " + maxExpenses + "рублей.");

// Задача 3;
        System.out.println("задача3");
        int[] expenses = {12500, 10000, 9550, 12000, 99000};
        int total = 0;
        for (int expense : expenses) {
            total += expense;
        }
        double average = total / 5.0;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");


        // Задача 4;
        System.out.println("задача4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }}}