package homework2.arrays;

import homework2.utils.ArraysUtils;

import java.util.Arrays;

public class ArrayTasks {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayRandom(50, 100);
        System.out.println("Сумма четных положительных элементов массива: " + sumOfEvenPositive(array));
        System.out.println("Максимальный из элементов массива с четными индексами: " + maxEvenIndex(array));
        System.out.println("Элементы массива, которые меньше среднего арифметического: " + Arrays.toString(lessThanAverage(array)));
        System.out.println("Два минимальных элемента массива: " + Arrays.toString(twoMinElements(array)));
        System.out.println("Сжатый массив: " + Arrays.toString(compressArray(array, 30, 70)));
        System.out.println("Сумма цифр массива: " + sumOfDigits(array));
    }

    public static int sumOfEvenPositive(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int maxEvenIndex(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int[] lessThanAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;
        int[] result = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < average) {
                result[index] = array[i];
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }

    public static int[] twoMinElements(int[] array) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min1) {
                min2 = min1;
                min1 = array[i];
            } else if (array[i] < min2) {
                min2 = array[i];
            }
        }
        return new int[]{min1, min2};
    }

    public static int[] compressArray(int[] array, int min, int max) {
        int[] result = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min || array[i] > max) {
                result[index] = array[i];
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }

    public static int sumOfDigits(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int number = Math.abs(array[i]);
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
        }
        return sum;
    }
}

