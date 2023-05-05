package homework1;

import java.util.Scanner;
public class ByteOperation1 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");//  Вводим первое число.


            int number1 = in.nextInt();
            System.out.print("Input second number: ");//  Вводим второе число.

                int number2 = in.nextInt();
                int xor = number1 ^ number2;
                int right = number1 >> number2;
                int left = number1 << number2;
                System.out.println("operation result \"xor\" =" + xor); // Вывод операции "исключающее или"
                System.out.println("operation result \"right\" =" + right);  // Вывод операция "сдвиг вправо"
                System.out.println("operation result \"left \" =" + left); // Вывод операция "сдвиг влево"

       /* System.out.println("Теперь попробуем с дробными числами");
        System.out.print("Input first number: ");//  Вводим первое число.


        double number3 = in.nextDouble();
        System.out.print("Input second number: ");//  Вводим второе число.

        double number4 = in.nextDouble();
        double xor1 = number3 ^ number4;
        double right1 = number3 >> number4;
        double left1 = number3 << number4;
        System.out.println("operation result \"xor1\" =" + xor1);
        System.out.println("operation result \"right1\" =" + right1);
        System.out.println("operation result \"left1 \" =" + left1);
        для побитовых опреаций дробные числа не подходят
        */


            }

        }


