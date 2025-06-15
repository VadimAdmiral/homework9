import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1;
        System.out.println("задача1");
        int[] payments = {12500, 10000, 9550, 12000, 99000};
        int summaWastes = 0;
        for (int outflow : payments) {
            summaWastes += outflow;
        }
        System.out.println("Сумма трат за месяц составила " + summaWastes + "рублей");

        // Задача 2;
        System.out.println("задача2");
        int minExpenses = payments[0];
        int maxExpenses = payments[0];

        for (int i = 1; i < payments.length; i++) {
            if (payments[i] < minExpenses) {
                minExpenses = payments[i];
            }
            if (payments[i] > maxExpenses) {
                maxExpenses = payments[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей. Максимальная сумма трат за неделю составила " + maxExpenses + " рублей.");


// Задача 3;
        System.out.println("задача3");
        int[] expenses = {12500, 10000, 9550, 12000, 99000};
        int total = 0;
        for (int expense : expenses) {
            total += expense;
        }
        double average = total / (double)expenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");


        // Задача 4;
        System.out.println("задача4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int left = 0;
        int right = reverseFullName.length - 1;
        while (left < right) {
            char temp = reverseFullName[left];
            reverseFullName[left] = reverseFullName[right];
            reverseFullName[right] = temp;
            left++;
            right--;
        }
        for (char c : reverseFullName) {
            System.out.print(c);
        }
        }}