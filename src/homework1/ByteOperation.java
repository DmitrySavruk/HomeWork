package homework1;

import java.util.Scanner;
public class ByteOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");//  Вводим первое число. У меня 5, в двоичной 101
        int first_number = in.nextInt();


        System.out.print("Input first number: ");// Вводим второе число. У меня 9, в двоичной 1001
        int second_number = in.nextInt();

        int and = first_number & second_number;// Операция "и": 101 & 1001, получаем 0001
        int or = first_number | second_number;// Операция "или": 101 | 1001, получаем 1101

        System.out.println("Результат операции \"and\" = " + and);
        System.out.println("Результат операции \"or\" = " + or);
    }
}


