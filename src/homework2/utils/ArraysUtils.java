package homework2.utils;
import java.util.Scanner;
import java.util.Random;
public class ArraysUtils {
        public static int[] arrayFromConsole() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Введите элемент массива: ");
                array[i] = scanner.nextInt();
            }
            return array;
        }

        public static int[] arrayRandom(int size, int maxValueExclusion) {
            Random random = new Random();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(maxValueExclusion);
            }
            return array;
        }

    }

    class Main {
        public static void main(String[] args) {
            int[] array1 = ArraysUtils.arrayFromConsole();
            int[] array2 = ArraysUtils.arrayRandom(5, 100);
            System.out.println("Массив, введенный с консоли: ");
            for (int i = 0; i < array1.length; i++) {
                System.out.print(array1[i] + " ");
            }
            System.out.println();
            System.out.println("Случайный массив: ");
            for (int i = 0; i < array2.length; i++) {
                System.out.print(array2[i] + " ");
            }
            System.out.println();
        }
    }
