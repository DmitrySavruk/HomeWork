package homework1;

import java.util.Scanner;

public class Task_4_4 {
    public static void main(String[] args) {
        Scanner Bytes = new Scanner(System.in);
        System.out.print("Введите количество байтов:");
        double number = Bytes.nextInt();
        System.out.println(number/1024 +"Kb" );
        Scanner KBytes = new Scanner(System.in);
        System.out.print("Введите количество килобайтов:");
        double number1 = Bytes.nextInt();
        System.out.println(number1*1024 +"b" );

    }

}
