package homework1;

import java.util.Scanner;
public class Task_4_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        if (number == 365 ){
            System.out.println("Год не високосный");
        }
        else if (number == 366){
            System.out.println("Год високосный");
        }
        else if (number>366 ^ number<365){

                System.out.println("Это точно год?");
            }
        }
    }

