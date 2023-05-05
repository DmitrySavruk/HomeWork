package homework2.arrays;
import homework2.utils.ArraysUtils;

import java.util.Scanner;
import java.util.Random;
public class ArraysIteration {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayFromConsole();
            printArray(array);
            printEverySecondElement(array);
            printArrayInReverseOrder(array);
        }

        public static void printArray(int[] array) {
            System.out.println("Printing array using do...while loop:");
            int i = 0;
            do {
                System.out.print(array[i] + " ");
                i++;
            } while (i < array.length);
            System.out.println();

            System.out.println("Printing array using while loop:");
            i = 0;
            while (i < array.length) {
                System.out.print(array[i] + " ");
                i++;
            }
            System.out.println();

            System.out.println("Printing array using for loop:");
            for (i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

            System.out.println("Printing array using foreach loop:");
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void printEverySecondElement(int[] array) {
            System.out.println("Printing every second element using do...while loop:");
            int i = 0;
            do {
                System.out.print(array[i] + " ");
                i += 2;
            } while (i < array.length);
            System.out.println();

            System.out.println("Printing every second element using while loop:");
            i = 0;
            while (i < array.length) {
                System.out.print(array[i] + " ");
                i += 2;
            }
            System.out.println();

            System.out.println("Printing every second element using for loop:");
            for (i = 0; i < array.length; i += 2) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

            System.out.println("Printing every second element using foreach loop:");
            i = 0;
            for (int element : array) {
                if (i % 2 == 0) {
                    System.out.print(element + " ");
                }
                i++;
            }
            System.out.println();
        }

        public static void printArrayInReverseOrder(int[] array) {
            System.out.println("Printing array in reverse order using do...while loop:");
            int i = array.length - 1;
            do {
                System.out.print(array[i] + " ");
                i--;
            } while (i >= 0);
            System.out.println();

            System.out.println("Printing array in reverse order using while loop:");
            i = array.length - 1;
            while (i >= 0) {
                System.out.print(array[i] + " ");
                i--;
            }
            System.out.println();

            System.out.println("Printing array in reverse order using for loop:");
            for (i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

            System.out.println("Printing array in reverse order using foreach loop:");
            int[] reversedArray = new int[array.length];
            i = 0;
            for (int element : array) {
                reversedArray[array.length - 1 - i] = element;
                i++;
            }
            for (int element : reversedArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
