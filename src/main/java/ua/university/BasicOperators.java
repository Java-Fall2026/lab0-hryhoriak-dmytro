package ua.university;

import java.util.Arrays;

public class BasicOperators {

    // 1. Повертає суму та середнє значення трьох чисел
    public static double[] sumAndAverage(int a, int b, int c) {
        double sum = (double) a + b + c;
        double average = sum / 3.0;
        return new double[]{sum, average};
    }

    // 2. Повертає максимальне з трьох чисел
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // 3. Переводить числовий бал (0-100) у літерну оцінку A-F
    public static char gradeFromScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        if (score >= 50) return 'E';
        return 'F';
    }

    // 4. Повертає назву дня тижня англійською (1 - Monday, 7 - Sunday)
    public static String dayOfWeek(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalArgumentException("Day must be between 1 and 7");
        };
    }

    // 5. Зворотний відлік від n до 1
    public static int[] countdown(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = n - i;
        }
        return result;
    }

    // 6. Факторіал числа n
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 7. Повертає розгорнуту копію масиву (оригінал не змінюється)
    public static int[] reverseArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // 8. Сума всіх елементів двовимірного масиву (матриці)
    public static int sumMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }
        int sum = 0;
        for (int[] row : matrix) {
            if (row != null) {
                for (int value : row) {
                    sum += value;
                }
            }
        }
        return sum;
    }

    // 9. Перевірка, чи є рядок паліндромом (з урахуванням регістру та пробілів)
    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    // 10. Знаходить мінімум [0] та максимум [1] у масиві
    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int min = arr[0];
        int max = arr[0];
        for (int value : arr) {
            if (value < min) min = value;
            if (value > max) max = value;
        }
        return new int[]{min, max};
    }

    // 11. Таблиця множення розміром n x n
    public static int[][] multiplicationTable(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be at least 1");
        }
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

    // 12. Усі парні числа від 2 до n включно
    public static int[] evenNumbersUpToN(int n) {
        if (n < 2) {
            return new int[0];
        }
        int[] result = new int[n / 2];
        for (int i = 0; i < result.length; i++) {
            result[i] = (i + 1) * 2;
        }
        return result;
    }

    // 13. Перевірка, чи є число простим
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 14. Підрахунок голосних літер (a, e, i, o, u)
    public static int countVowels(String s) {
        if (s == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    // 15. Перші n чисел Фібоначчі (починаючи з 0 і 1)
    public static int[] fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }
        if (n == 0) {
            return new int[0];
        }
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1) {
            fib[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    // 16. Транспонування матриці (рядки та стовпці міняються місцями)
    public static int[][] transpose(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }
        if (matrix.length == 0) {
            return new int[0][0];
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // 17. Відсортована копія масиву за зростанням (оригінал не змінюється)
    public static int[] sortArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        return sorted;
    }
}