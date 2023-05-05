package homework1;

import java.util.Scanner;
public class Task_4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        double number1 = in.nextDouble();
        System.out.print("Input second number: ");
        double number2 = in.nextDouble();
        System.out.print("Input third number: ");
        double number3 = in.nextDouble();

        double summ = (number1 + number2 + number3) / 3;
        System.out.println(summ);


    }
}
