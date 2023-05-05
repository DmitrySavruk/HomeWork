package homework2.loops;
import java.util.Random;
import java.util.Scanner;
/*public class Task1_5 {

    }
    public static void max() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int number = in.nextInt();
        int max = number % 10;


        while (number > 0) {
            if (number % 10 > max) {
                max = number % 10;
            }
            number /= 10;
        }
        System.out.println("Максимальная цифра: " + max);

    }

    public static void probably() {
        Random random = new Random();
        int q = 0;
        int n = 1000;
        for (int i = 0; i < n; i++) {
            int number = random.nextInt();
            if (number % 2 == 0) {
                q++;
            }
        }
        double percent = (double) q / n;
        System.out.println("Вероятность четного числа: " + percent * 100 + "%");

        public static void chet(){
            Scanner in = new Scanner(System.in);
            System.out.print("Введите натуральное число: ");
            int number = in.nextInt();
            int even = 0;
            int odd = 0;


            while (number > 0) {
                if (number % 2 == 0) {
                    even += 1;
                } else {
                    odd += 1;
                }
                number /= 10;
            }
            System.out.println("Четных чисел: " + even + "\nНечетных чисел: " + odd);

            public static void limit(){
                Scanner in = new Scanner(System.in);
                System.out.print("Введите число: ");
                int number = in.nextInt();
                int number1 = 1;
                int number2 = 2;
                int f;
                System.out.print(number1 + " " + number2 + " ");
                for (int i = 3; i <= number; i++) {
                    System.out.print((number1 + number2) + " ");
                    f = number1;
                    number1 = number2;
                    number2 = number1 + f;
                    public static void arrayCompression() {
                        Scanner in = new Scanner(System.in);
                        System.out.print("Введите минимум: ");
                        int min = in.nextInt();
                        System.out.print("Введите максимум: ");
                        int max = in.nextInt();
                        System.out.print("Введите шаг: ");
                        int step = in.nextInt();
                        if (max < min) {
                            System.out.print("Введен неверный максимум, введите максимум больше минимума!");
                        }
                        for (int i = min; i <= max; i += step) {
                            System.out.print(i + " ");
                        }
                        public static void reverse(){
                            Scanner in = new Scanner(System.in);
                            System.out.print("Введите число: ");
                            int number = in.nextInt();
                            int reversedNumber = 0;
                            while (number != 0) {
                                int digit = number % 10;
                                reversedNumber = reversedNumber * 10 + digit;
                                number /= 10;
                            }
                            System.out.println("Обратное число: " + reversedNumber);

                        }
                    }
                }
            }
        }
    }*/
