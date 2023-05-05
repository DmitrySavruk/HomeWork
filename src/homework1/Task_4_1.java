package homework1;

import java.util.Scanner;
public class Task_4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.print("Input number: ");
                     int number = in.nextInt();
        if ((number%2)==0){ // проверка числа на четность, если оно делится без остатка на 2, то оно четное
            System.out.println("Введенное число четное");
        }
        else {

                System.out.println("Введеное число нечетное");
            }
        }


    }

