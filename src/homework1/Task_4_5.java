package homework1;

import java.util.Scanner;
public class Task_4_5 {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        System.out.print("Введите букву: ");

        String symbol = letter.nextLine();
        if (symbol.length() == 1) {
            char b = symbol.charAt(0);
            boolean isLatter = Character.isLetter(b);
            if (isLatter) {
                System.out.println("Вы ввели букву -"  + symbol);
            } else {
                System.out.println("Вы ввели не букву");
            }

        } else {
            System.out.println("Вы ввесли больше одного символа");
        }
    }
}
