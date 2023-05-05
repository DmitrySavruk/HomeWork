package homework1;

import java.util.Scanner;
public class Name3 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("как вас зовут?: ");

        String a = name.nextLine();

        switch (a) {
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я так долго тебя ждал");
                break;
            case "Анастасия":
                System.out.println("Я так долго тебя ждал");
                break;

            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}